package Logica;

import Interfaz.ITSaChatServer;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class ServerProperties {

    private static ITSaChatServer ventana;
    private static ServerSocket server;
    private static Socket socket;
    private static String puerto = "9000";
    private static boolean exit = false;
    private static S2C[] conexiones = new S2C[0];
    private static String[] blacklist = {"El nodeseado","Persona toxica","malapersona"};
    private static String[] whitelist = {"El bueno","el invitado","el amigo"};
    private static boolean blacklistOn = false;
    private static boolean whitelistOn = false;
    private static String ipFtp = "192.168.0.2";
    private static String puertoFtp = "3721";
    private static String nombre = "Server";
    private static String estado = "Manejando los hilos del chat";
    private static String userFtp = "asd";
    private static String pswFtp = "asd";
    private static String rutaDes = "/home/mateo/Escritorio/";
    private static String rutaFtp = "/ITSaChat/Archivos/";
    private static boolean inicio = false;

    public static ITSaChatServer getVentana() {
        return ventana;
    }

    public static void setVentana(ITSaChatServer ventana) {
        ServerProperties.ventana = ventana;
    }

    public static ServerSocket getServer() {
        return server;
    }

    public static void setServer(ServerSocket server) {
        ServerProperties.server = server;
    }

    public static Socket getSocket() {
        return socket;
    }

    public static void setSocket(Socket socket) {
        ServerProperties.socket = socket;
    }

    public static String getPuerto() {
        return puerto;
    }

    public static void setPuerto(String puerto) {
        ServerProperties.puerto = puerto;
    }

    public static boolean isExit() {
        return exit;
    }

    public static void setExit(boolean exit) {
        ServerProperties.exit = exit;
    }

    public static S2C[] getConexiones() {
        return conexiones;
    }

    public static void setConexiones(S2C[] conexiones) {
        ServerProperties.conexiones = conexiones;
    }

    public static String[] getBlacklist() {
        return blacklist;
    }

    public static void setBlacklist(String blacklist) {
        ServerProperties.blacklist = blacklist.split(",");
    }

    public static String[] getWhitelist() {
        return whitelist;
    }

    public static void setWhitelist(String whitelist) {
        ServerProperties.whitelist = whitelist.split(",");
    }

    public static String getIpFtp() {
        return ipFtp;
    }

    public static void setIpFtp(String ipFtp) {
        ServerProperties.ipFtp = ipFtp;
    }

    public static String getPuertoFtp() {
        return puertoFtp;
    }

    public static void setPuertoFtp(String puertoFtp) {
        ServerProperties.puertoFtp = puertoFtp;
    }

    public static boolean isBlacklistOn() {
        return blacklistOn;
    }

    public static void setBlacklistOn(boolean blacklistOn) {
        ServerProperties.blacklistOn = blacklistOn;
    }

    public static boolean isWhitelistOn() {
        return whitelistOn;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        ServerProperties.nombre = nombre;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        ServerProperties.estado = estado;
    }

    public static void setWhitelistOn(boolean whitelistOn) {
        ServerProperties.whitelistOn = whitelistOn;
    }

    public static String getUserFtp() {
        return userFtp;
    }

    public static void setUserFtp(String userFtp) {
        ServerProperties.userFtp = userFtp;
    }

    public static String getPswFtp() {
        return pswFtp;
    }

    public static void setPswFtp(String pswFtp) {
        ServerProperties.pswFtp = pswFtp;
    }

    public static String getRutaDes() {
        return rutaDes;
    }

    public static void setRutaDes(String rutaDes) {
        ServerProperties.rutaDes = rutaDes;
    }

    public static String getRutaFtp() {
        return rutaFtp;
    }

    public static void setRutaFtp(String rutaFtp) {
        ServerProperties.rutaFtp = rutaFtp;
    }

    public static boolean isInicio() {
        return inicio;
    }

    public static void setInicio(boolean inicio) {
        ServerProperties.inicio = inicio;
    }

    public static boolean isOnBlacklist(String usuario) {
        for (String i : blacklist) {
            if (i.equals(usuario)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOnWhitelist(String usuario) {
        if (usuario.startsWith("Cliente ")) {
            return true;
        }
        for (String i : whitelist) {
            if (i.equals(usuario)) {
                return true;
            }
        }
        return false;
    }

}
