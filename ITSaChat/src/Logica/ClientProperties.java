package Logica;

import Interfaz.ITSaChatClient;
import java.net.Socket;

public abstract class ClientProperties {

    private static ITSaChatClient ventana;
    private static Socket socket;
    private static String puerto = "9000";
    private static boolean exit = false;
    private static String ipFtp = "192.168.0.2";
    private static String puertoFtp = "3721";
    private static String nombre = "Mateo";
    private static String estado = "Aquí siendo un cliente";
    private static String userFtp = "asd";
    private static String pswFtp = "asd";
    private static String rutaDes = "/home/mateo/Escritorio/";
    private static String rutaFtp = "/ITSaChat/Archivos/";
    private static boolean inicio = false;
    private static String ipServer = "localhost";

    private static boolean first = false;
    public static ITSaChatClient getVentana() {
        return ventana;
    }

    public static void setVentana(ITSaChatClient ventana) {
        ClientProperties.ventana = ventana;
    }

    public static Socket getSocket() {
        return socket;
    }

    public static void setSocket(Socket socket) {
        ClientProperties.socket = socket;
    }

    public static String getPuerto() {
        return puerto;
    }

    public static void setPuerto(String puerto) {
        ClientProperties.puerto = puerto;
    }

    public static boolean isExit() {
        return exit;
    }

    public static void setExit(boolean exit) {
        ClientProperties.exit = exit;
    }

   

    public static String getIpFtp() {
        return ipFtp;
    }

    public static boolean isFirst() {
        return first;
    }

    public static void setFirst(boolean first) {
        ClientProperties.first = first;
    }

    public static void setIpFtp(String ipFtp) {
        ClientProperties.ipFtp = ipFtp;
    }

    public static String getPuertoFtp() {
        return puertoFtp;
    }

    public static void setPuertoFtp(String puertoFtp) {
        ClientProperties.puertoFtp = puertoFtp;
    }


    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        ClientProperties.nombre = nombre;
    }

    public static String getEstado() {
        return estado;
    }

    public static void setEstado(String estado) {
        ClientProperties.estado = estado;
    }

    public static String getUserFtp() {
        return userFtp;
    }

    public static void setUserFtp(String userFtp) {
        ClientProperties.userFtp = userFtp;
    }

    public static String getPswFtp() {
        return pswFtp;
    }

    public static void setPswFtp(String pswFtp) {
        ClientProperties.pswFtp = pswFtp;
    }

    public static String getRutaDes() {
        return rutaDes;
    }

    public static void setRutaDes(String rutaDes) {
        ClientProperties.rutaDes = rutaDes;
    }

    public static String getRutaFtp() {
        return rutaFtp;
    }

    public static void setRutaFtp(String rutaFtp) {
        ClientProperties.rutaFtp = rutaFtp;
    }

    public static boolean isInicio() {
        return inicio;
    }

    public static void setInicio(boolean inicio) {
        ClientProperties.inicio = inicio;
    }

    public static String getIpServer() {
        return ipServer;
    }

    public static void setIpServer(String ipServer) {
        ClientProperties.ipServer = ipServer;
    }

}
