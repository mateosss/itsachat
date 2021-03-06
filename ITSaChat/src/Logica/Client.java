//maneja las nuevas conexiones de clientes
//y se encarga de difundir los mensajes entre los clientes
package Logica;

import Interfaz.ITSaChatClient;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends Thread {

    DataOutputStream salida;
    BufferedReader entrada;

    public Client(String msg, ITSaChatClient ventana) {
        super(msg);
        ClientProperties.setVentana(ventana);
    }

    @Override
    public void run() {
        try {
            this.conectar();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void conectar() throws IOException, ClassNotFoundException {
        ClientProperties.setSocket(new Socket(InetAddress.getByName(ClientProperties.getIpServer()), Integer.parseInt(ClientProperties.getPuerto())));
        try {
            entrada = new BufferedReader(new InputStreamReader(ClientProperties.getSocket().getInputStream()));
            salida = new DataOutputStream(ClientProperties.getSocket().getOutputStream());
            //salida.flush();
            while (!ClientProperties.isExit()) {

                String mensaje = entrada.readLine();
                if (mensaje != null) {

                    if (!mensaje.equals("")) {
                        StringBuilder builder = new StringBuilder();
                        for (String s : mensaje.split(" ")) {
                            builder.append(s);
                        }
                        String res = builder.toString();
                        MensajeFormateado aux = new MensajeFormateado(ClientProperties.getVentana(), res);
                    }
                } else {
                    this.cerrarConexion();
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("1");
        }

    }

    public void enviarMensaje(String mensaje) {
        if (mensaje.startsWith("/archivo ")) {
            String[] mensajeDescompuesto = mensaje.split(" ");
            String res = "";
            for (int i = 1; i < mensajeDescompuesto.length; i++) {
                if (i != mensajeDescompuesto.length - 1) {
                    res = res.concat(mensajeDescompuesto[i] + " ");
                } else {
                    res = res.concat(mensajeDescompuesto[i]);
                }
            }
            this.subirArchivo(ClientProperties.getIpFtp(), Integer.parseInt(ClientProperties.getPuertoFtp()), ClientProperties.getUserFtp(), ClientProperties.getPswFtp(), ClientProperties.getRutaFtp(), res);
        }

        try {
            if (!mensaje.equals("")) {
                salida.writeChars(mensaje + "\n");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void formatearMensaje(String mensaje) {
        MensajeFormateado mensajeFormateado = new MensajeFormateado(ClientProperties.getVentana(), mensaje);

    }

    public void cerrarConexion() {
        try {
            this.entrada.close();
            this.salida.close();
            ClientProperties.getSocket().close();
            ClientProperties.setExit(true);
            System.out.println("me sali");

        } catch (IOException ex) {
            System.out.println("Error al cerrar la conexión");
        }
    }

    public void subirArchivo(final String ftpServer, final int puerto, final String user, final String password, final String location, final String file) {

        Runnable exec = new Runnable() {
            @Override
            public void run() {
                FTP.subir(ftpServer, puerto, user, password, location, file);
            }
        };
        new Thread(exec, "Subir").start();
        //FTP.run(ftpServer, puerto, user, password, location, file);
    }

}
