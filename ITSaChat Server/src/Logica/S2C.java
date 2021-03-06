//S2C signfica Server to Client, osea la comunicacion entre el server con un cliente. 
//se crea una de estas por cada cliente
package Logica;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class S2C extends Thread {

    Server server;
    DataOutputStream salida;
    BufferedReader entrada;
    Socket socket;
    boolean exit = false;

    public S2C(String msg) {
        super(msg);
    }

    @Override
    public void run() {
        try {
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            salida = new DataOutputStream(socket.getOutputStream());
            while (!exit) {

                String mensaje = entrada.readLine();
                if (mensaje != null) {

                    if (!mensaje.equals("")) {
            StringBuilder builder = new StringBuilder();
                        for (String s : mensaje.split(" ")) {
                            builder.append(s);
                        }
                        String res = builder.toString();
                        this.server.enviarMensaje(this, res);

                    }
                } else {
                    this.server.enviarMensaje(null, "alerta > " + this.getName() + " Se ha desconectado.");
                    this.cerrarConexion();
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.err.println(this.getName() + " se ha desconectado.");
            server.enviarMensaje(null, "alerta > " + this.getName() + " Se ha desconectado.");
        }
    }

//metodos
    public void enviarMensaje(String mensaje) {
        try {
            salida.writeChars(mensaje);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cerrarConexion() {
        try {
            this.entrada.close();
            this.salida.close();
            this.socket.close();
            this.exit = true;
            System.out.println("me sali");
        } catch (IOException ex) {
            Logger.getLogger(S2C.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //getters and setters
    public DataOutputStream getSalida() {
        return salida;
    }

    public void setSalida(DataOutputStream salida) {
        this.salida = salida;
    }

    public BufferedReader getEntrada() {
        return entrada;
    }

    public void setEntrada(BufferedReader entrada) {
        this.entrada = entrada;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

}
