package Logica;

import Interfaz.ITSaChatServer;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public final class MensajeFormateado {

    private String mensaje;
    private ITSaChatServer ventana;

//constructor, to string, etc
    public MensajeFormateado(ITSaChatServer ventana, String mensaje) {
        this.setVentana(ventana);
        this.eliminarSaltos(mensaje);
        this.formatear();
    }

//metodos
    public void eliminarSaltos(String mensaje) {
        String[] aux = mensaje.split("\n");
        String mensajeSinSaltos = aux[0];
        this.setMensaje(mensajeSinSaltos);

    }

    public void formatear() {
        //variables de formato

        SimpleAttributeSet estiloUsuario = new SimpleAttributeSet();
        StyleConstants.setBold(estiloUsuario, true);
        StyleConstants.setFontSize(estiloUsuario, 16);
        StyleConstants.setForeground(estiloUsuario, java.awt.Color.black);

        SimpleAttributeSet estiloNormal = new SimpleAttributeSet();
        StyleConstants.setForeground(estiloNormal, java.awt.Color.black);
        StyleConstants.setFontSize(estiloNormal, 14);

        SimpleAttributeSet estiloAlerta = new SimpleAttributeSet();
        StyleConstants.setBold(estiloAlerta, true);
        StyleConstants.setItalic(estiloAlerta, true);
        java.awt.Color colorITS = new java.awt.Color(52, 84, 101);
        StyleConstants.setForeground(estiloAlerta, colorITS);
        StyleConstants.setFontSize(estiloAlerta, 12);

        SimpleAttributeSet estiloServer = new SimpleAttributeSet();
        StyleConstants.setBold(estiloServer, true);
        StyleConstants.setItalic(estiloServer, true);
        //despues metele empeza con los colores aleatorios y los iconos, los botones de archivos y eso :D
        java.awt.Color colorServer = new java.awt.Color(0, 168, 202);
        StyleConstants.setForeground(estiloServer, colorServer);
        StyleConstants.setFontSize(estiloServer, 15);

        //Variables del mensaje
        String[] mensajeEn2Partes = mensaje.split(" > ");
        String usuario = mensajeEn2Partes[0];
        String mensajeLimpio = "";
        for (int i = 0; i + 1 < mensajeEn2Partes.length; i++) {
            if (i + 1 < mensajeEn2Partes.length - 1) {
                mensajeLimpio = mensajeLimpio.concat(mensajeEn2Partes[i + 1] + " > ");
            } else {
                mensajeLimpio = mensajeLimpio.concat(mensajeEn2Partes[i + 1]);
            }
        }
        //analizar
        if (usuario.equalsIgnoreCase("alerta")) {
            insString(mensajeLimpio + "\n", estiloAlerta);

        } else {
            if (usuario.equalsIgnoreCase(ServerProperties.getNombre())) {
                insString(mensaje + "\n", estiloServer);
                if (usuario.equalsIgnoreCase("server")) {
                    if (mensajeLimpio.startsWith("/setftp")) {
                        System.out.println("patete");
                        String ip = mensajeLimpio.split(" ")[1];
                        String puerto = mensajeLimpio.split(" ")[2];
                        ServerProperties.setIpFtp(ip);
                        ServerProperties.setPuertoFtp(puerto);
                        StringBuilder builder = new StringBuilder();
                        for (String s : ServerProperties.getBlacklist()) {
                            builder.append(s);
                        }
                        String blacklist = builder.toString();
                        builder = new StringBuilder();
                        for (String s : ServerProperties.getWhitelist()) {
                            builder.append(s);}
                        String whitelist = builder.toString();
                        String whiltelist = builder.toString();
                        Object[] datos = {ip, puerto, blacklist, ServerProperties.isBlacklistOn(), whitelist, ServerProperties.isWhitelistOn(), ServerProperties.getNombre(), ServerProperties.getEstado(), ServerProperties.getPuerto(), ServerProperties.getUserFtp(), ServerProperties.getPswFtp(), ServerProperties.getRutaDes(), ServerProperties.getRutaFtp(), ServerProperties.isInicio()};
                        try {
                            SaveLoad.save(datos);
                        } catch (IOException e) {
                            System.out.println("Error al modificar el servidor FTP");
                        }
                    }
                }

            } else {
                if (mensajeLimpio.startsWith("/usuario ")) {
                    String[] mensajeDescompuesto = mensajeLimpio.split(" ");
                    String usuarioNuevo = "";
                    for (int i = 0; i + 1 < mensajeDescompuesto.length; i++) {
                        if (i + 1 < mensajeDescompuesto.length - 1) {
                            usuarioNuevo = usuarioNuevo.concat(mensajeDescompuesto[i + 1] + " ");
                        } else {
                            usuarioNuevo = usuarioNuevo.concat(mensajeDescompuesto[i + 1]);
                        }
                    }

                    insString(usuario, estiloUsuario);
                    insString(" ha cambiado su nombre a ", estiloAlerta);
                    insString(usuarioNuevo + "\n", estiloUsuario);

                } else {

                    if (mensajeLimpio.startsWith("/privado ")) {
                        insString(usuario, estiloServer);
                        insString(mensajeLimpio + "\n", estiloNormal);
                    } else {

                        if (mensajeLimpio.startsWith("/archivo ")) {
                            javax.swing.JButton boton;
                            String extension = mensajeLimpio.substring(mensajeLimpio.length() - 4, mensajeLimpio.length());
                            String nombreArchivo = mensajeLimpio.split("/")[mensajeLimpio.split("/").length - 1];
                            if (extension.equalsIgnoreCase(".jpg") || extension.equalsIgnoreCase(".png") || extension.equalsIgnoreCase(".gif") || extension.equalsIgnoreCase(".bmp") || extension.equalsIgnoreCase(".svg")) {
                                boton = crearBoton(nombreArchivo, "/Resource/descargarImagen.png");
                            } else {
                                if (extension.equalsIgnoreCase(".wav") || extension.equalsIgnoreCase(".mp3") || extension.equalsIgnoreCase(".ogg")) {
                                    boton = crearBoton(nombreArchivo, "/Resource/descargarAudio.png");

                                } else {
                                    if (extension.equalsIgnoreCase(".mp4") || extension.equalsIgnoreCase(".avi") || extension.equalsIgnoreCase(".3gp") || extension.equalsIgnoreCase(".wmv") || extension.equalsIgnoreCase(".mkv")) {
                                        boton = crearBoton(nombreArchivo, "/Resource/descargarVideo.png");

                                    } else {
                                        if (extension.equalsIgnoreCase(".doc") || extension.equalsIgnoreCase("docx") || extension.equalsIgnoreCase(".odt") || extension.equalsIgnoreCase(".odf") || extension.equalsIgnoreCase(".pdf")) {
                                            boton = crearBoton(nombreArchivo, "/Resource/descargarDocumento.png");
                                        } else {
                                            boton = crearBoton(nombreArchivo, "/Resource/descargarArchivo.png");

                                        }

                                    }
                                }
                            }
                            insString(usuario + ":", estiloUsuario);
                            //insString("Ha enviado el archivo " + mensajeLimpio.split("/")[mensajeLimpio.split("/").length - 1] + "\n", estiloAlerta);
                            insComp(boton);
                        } else {
                            if (mensajeLimpio.equalsIgnoreCase("/camON")) {
                                insString(usuario, estiloUsuario);
                                insString(" ha activado la cámara\n", estiloAlerta);
                            } else {
                                if (mensajeLimpio.equalsIgnoreCase("/camOFF")) {
                                    insString(usuario, estiloUsuario);
                                    insString(" ha desactivado la cámara\n", estiloAlerta);
                                } else {
                                    if (mensajeLimpio.equalsIgnoreCase("/micON")) {
                                        insString(usuario, estiloUsuario);
                                        insString(" ha activado el micrófono\n", estiloAlerta);
                                    } else {
                                        if (mensajeLimpio.equalsIgnoreCase("/micOFF")) {
                                            insString(usuario, estiloUsuario);
                                            insString(" ha desactivado el micrófono\n", estiloAlerta);
                                        } else {
                                            if (mensajeLimpio.equalsIgnoreCase("/salir")) {
                                                insString(usuario, estiloUsuario);
                                                insString(" se ha desconectado\n", estiloAlerta);
                                            } else {

                                                insString(usuario + ": ", estiloUsuario);
                                                insString(mensajeLimpio + "\n", estiloNormal);
                                            }
                                        }
                                    }
                                }

                            }
                        }

                    }
                }
            }
        }

    }

    public void insString(String texto, SimpleAttributeSet estilo) {
        StyledDocument documento = ventana.getChatDocument();
        try {
            documento.insertString(documento.getLength(), texto, estilo);
            ventana.getChat().setCaretPosition(documento.getLength());
        } catch (BadLocationException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    public javax.swing.JButton crearBoton(final String nombreArchivo, String iconoPath) {

        javax.swing.JButton boton = new javax.swing.JButton();
        java.awt.Dimension tam = new java.awt.Dimension(256, 32);
        javax.swing.Icon icono = new javax.swing.ImageIcon(getClass().getResource(iconoPath));

        boton.setBackground(new java.awt.Color(52, 84, 101));
        boton.setFont(new java.awt.Font("Ubuntu", 0, 12));
        boton.setForeground(new java.awt.Color(52, 84, 101));
        boton.setIcon(icono);
        boton.setText(nombreArchivo);
        boton.setPreferredSize(tam);

        boton.setToolTipText("Descargar archivo en " + ServerProperties.getRutaFtp() + nombreArchivo);
        boton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    descargarArchivo(ServerProperties.getRutaFtp() + nombreArchivo);
                } catch (IOException ex) {
                    Logger.getLogger(MensajeFormateado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        return boton;
    }

    public void insComp(java.awt.Component comp) {
        ventana.insertComponent(comp);
    }

    //getters and setters
    public void descargarArchivo(final String rutaFtp) throws IOException {
        Runnable exec = new Runnable() {
            @Override
            public void run() {
                System.out.println("ADASDASDSAD");

                try {
                    FTP.bajar(ServerProperties.getIpFtp(), ServerProperties.getUserFtp(), ServerProperties.getPswFtp(), ServerProperties.getRutaDes() + rutaFtp.split("/")[rutaFtp.split("/").length - 1], rutaFtp);
                } catch (IOException ex) {
                    Logger.getLogger(MensajeFormateado.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        new Thread(exec, "Descargar").start();

    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ITSaChatServer getVentana() {
        return this.ventana;
    }

    public void setVentana(ITSaChatServer ventana) {
        this.ventana = ventana;
    }

}
