//maneja las nuevas conexiones de clientes
//y se encarga de difundir los mensajes entre los clientes
package Logica;

import Interfaz.ITSaChatServer;
import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

public class Server extends Thread {

    public Server(String msg, ITSaChatServer ventana) {
        super(msg);
        ServerProperties.setVentana(ventana);
    }

    @Override
    public void run() {
        this.escuchar();
    }

    public void escuchar() {
        try {

            ServerProperties.setServer(new ServerSocket(Integer.parseInt(ServerProperties.getPuerto())));
            ServerProperties.setSocket(new Socket());

            int contAux = 0;
            while (!ServerProperties.isExit()) {

                contAux++;

                ServerProperties.setSocket(ServerProperties.getServer().accept());
                if (!ServerProperties.isExit()) {
                    ServerProperties.getSocket().getInetAddress();

                    S2C conexionClienteServer = new S2C("Cliente " + contAux);
                    this.enviarMensaje(null, "Alerta > " + conexionClienteServer.getName() + " Se ha conectado.");

                    conexionClienteServer.setSocket(ServerProperties.getSocket());
                    conexionClienteServer.setServer(this);
                    conexionClienteServer.start();
                    this.addConexion(conexionClienteServer);

                    System.out.println("numero de THREADS:" + S2C.activeCount());

                }
            }
            ServerProperties.getSocket().close();
            ServerProperties.getServer().close();

        } catch (IOException | java.lang.NullPointerException e) {
            this.enviarMensaje(null, ServerProperties.getNombre() + " > Servidor Terminado ");
            this.enviarMensaje(null, e.getMessage());
        }

    }
    //metodos/////////////////////////////////////////////////////////////////////////////////////

    public void enviarMensaje(S2C usuario, String mensaje) {
        boolean hacer = true;
        boolean blacklist = false;
        boolean whitelist = false;
        if (usuario != null) {
            blacklist = ServerProperties.isBlacklistOn() && ServerProperties.isOnBlacklist(usuario.getName());
            whitelist = ServerProperties.isWhitelistOn() && !ServerProperties.isOnWhitelist(usuario.getName());
        }
        //comprueba cosas de blacklist y whitelist
        if (blacklist || whitelist) {
            hacer = false;
        }
        if (hacer) {

            //lo hace!
            String emisor;
            String mensajeArmado;
            //se fija si es un mensaje enviado por alguien o si es un mensaje de advertencia sin emisor que mostrar
            if (usuario == null) {
                emisor = "";
            } else {
                emisor = usuario.getName() + " > ";
            }
            //se fija si el mensaje es privado, si no es así, también se fija si es alguna clase de orden especial que 
            //que debe ejecutar cierta funcion y la ejecuta
            S2C receptorPrivado = this.verificarMensajeEjecutable(usuario, mensaje);
            //completa el mensaje a enviar a los clientes con su emisor
            mensajeArmado = emisor + mensaje + "\n";
            if (ServerProperties.getConexiones() != null) {
                if (receptorPrivado != null) {
                    if (receptorPrivado != usuario) {
                        receptorPrivado.enviarMensaje(mensajeArmado);

                    } else {
                        usuario.enviarMensaje("El usuario no se encuentra disponible");
                    }
                } else {

                    for (int i = 0; i < ServerProperties.getConexiones().length; i++) {
                        if (ServerProperties.getConexiones()[i] != null) {
                            ServerProperties.getConexiones()[i].enviarMensaje(mensajeArmado);
                        }
                    }
                }
            }
            this.formatearMensaje(mensajeArmado);
            try {
                ServerProperties.getVentana().getOutputDocument().insertString(ServerProperties.getVentana().getOutput().getDocument().getLength(), mensajeArmado, null);
                ServerProperties.getVentana().getOutput().setCaretPosition(ServerProperties.getVentana().getOutputDocument().getLength());
            } catch (BadLocationException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public S2C verificarMensajeEjecutable(S2C usuario, String orden) {
        //se fija si es un mensaje privado. o algun otro tipo de mensaje ejecutable
        if (orden != null) {

            //cambia el nombre de usuario
            if (orden.startsWith("/usuario ") && !orden.equalsIgnoreCase("/usuario server")) {
                String[] mensajeDescompuesto = orden.split(" ");
                String res = "";
                String usuarioAntiguo = usuario.getName();
                for (int i = 0; i + 1 < mensajeDescompuesto.length; i++) {
                    if (i + 1 < mensajeDescompuesto.length - 1) {
                        res = res.concat(mensajeDescompuesto[i + 1] + " ");

                    } else {
                        res = res.concat(mensajeDescompuesto[i + 1]);
                    }
                }

                usuario.setName(res);
                return null;
            }
            //envia mensaje privado
            if (orden.startsWith("/privado ")) {
                String receptor;
                String[] mensajeDescompuesto = orden.split("\"");
                System.out.println(mensajeDescompuesto[1]);
                receptor = mensajeDescompuesto[1];
                for (int j = 0; j < ServerProperties.getConexiones().length; j++) {
                    if (ServerProperties.getConexiones()[j].getName().equals(receptor)) {
                        return ServerProperties.getConexiones()[j];
                    }

                }

                return usuario;
            }

            //envia un archivo
            if (orden.startsWith(ServerProperties.getNombre() + " > /archivo ")) {

                if (usuario == null) {
                    String[] mensajeDescompuesto = orden.split(" ");
                    String res = "";
                    for (int i = 3; i < mensajeDescompuesto.length; i++) {
                        if (i != mensajeDescompuesto.length - 1) {
                            res = res.concat(mensajeDescompuesto[i] + " ");
                        } else {
                            res = res.concat(mensajeDescompuesto[i]);
                        }

                    }
                    System.out.println("----");
                    System.out.println(res);
                    System.out.println("----");
                    this.subirArchivo(ServerProperties.getIpFtp(), Integer.parseInt(ServerProperties.getPuertoFtp()), ServerProperties.getUserFtp(), ServerProperties.getPswFtp(), ServerProperties.getRutaFtp(), res);
                }
                return null;

            }
            //activa cosas, lo prometo!!!
            if (orden.equalsIgnoreCase("/camON")) {
                System.out.println("INICIA VIDEOCONFERENCIA LO PROMETO!!!!");
                return null;
            }
            if (orden.equalsIgnoreCase("/camOFF")) {
                System.out.println("DESACTIVA VIDEOCONFERENCIA LO PROMETO!!!!");
                return null;
            }
            if (orden.equalsIgnoreCase("/micON")) {
                System.out.println("INICIA LLAMADA LO PROMETO!!!!");
                return null;
            }
            if (orden.equalsIgnoreCase("/micOFF")) {
                System.out.println("DESACTIVA LLAMADA LO PROMETO!!!!");
                return null;
            }
            //termina la conexion por voluntad propia
            if (orden.equalsIgnoreCase("/salir")) {
                usuario.cerrarConexion();
                return null;

            }
//desconexion inesperada del cliente
        } else {
            usuario.cerrarConexion();
            return null;

        }
        return null;
    }

    public void formatearMensaje(String mensaje) {
        MensajeFormateado mensajeFormateado = new MensajeFormateado(ServerProperties.getVentana(), mensaje);

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

    public void addConexion(S2C conexion) {
        S2C[] conexionesAux = new S2C[ServerProperties.getConexiones().length + 1];
        for (int i = 0; i < ServerProperties.getConexiones().length; i++) {
            conexionesAux[i] = ServerProperties.getConexiones()[i];
        }
        conexionesAux[conexionesAux.length - 1] = conexion;
        ServerProperties.setConexiones(conexionesAux);
    }

}
