//Gracias a la base de esta clase a http://javayotros.blogspot.com.ar/2012/09/subir-archivos-mediante-ftp-con-java.html
package Logica;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 * @author Leyer
 */
public abstract class FTP {

    public FTP() {
        System.out.println("Cuack cuack cuaaaaack");
    }

    public static void subir(String ftpServer, int puerto, String user, String password, String location, String file) {
        uploadFileToFTP(ftpServer, puerto, user, password, location, new File(file), true);
        System.out.println(file);
    }

    public static void bajar(String server, String user, String pass, String localPath, String remotePath) throws MalformedURLException, IOException {
        downloadFileByFTP(server, user, pass, localPath, remotePath);

    }

    /**
     * Sube un archivo a un servidor FTP
     *
     * @param ftpServer Servidor FTP
     * @param puerto puerto del servidor
     * @param user Usuario
     * @param password Contraseña
     * @param location Directorio donde se subira el archivo
     * @param file Archivo que se va a subir
     * @param debug Para Mostrar las respuestas del servidor
     *
     */
    public static synchronized void uploadFileToFTP(String ftpServer, int puerto, String user, String password, String location, File file, boolean debug) {
        try {
            if (file.exists()) {
                System.out.println("subiendo" + file.getPath());
                Socket socket = new Socket(ftpServer, puerto);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                bufferedWriter.write("USER " + user + "\r\n");
                bufferedWriter.flush();
                bufferedWriter.write("PASS " + password + "\r\n");
                bufferedWriter.flush();
                bufferedWriter.write("CWD " + location + "\r\n");
                bufferedWriter.flush();
                bufferedWriter.write("TYPE A\r\n");
                bufferedWriter.flush();
                bufferedWriter.write("PASV\r\n");
                bufferedWriter.flush();
                String response = null;
                while ((response = bufferedReader.readLine()) != null) {
                    if (debug) {
                        System.out.println(response);
                    }
                    if (response.startsWith("530")) {
                        System.err.println("Login aunthentication failed");
                        break;
                    }
                    if (response.startsWith("227")) {
                        String address = null;
                        int port = -1;
                        int opening = response.indexOf('(');
                        int closing = response.indexOf(')', opening + 1);
                        if (closing > 0) {
                            String dataLink = response.substring(opening + 1, closing);
                            StringTokenizer tokenizer = new StringTokenizer(dataLink, ",");
                            try {
                                address = tokenizer.nextToken() + "." + tokenizer.nextToken() + "." + tokenizer.nextToken() + "." + tokenizer.nextToken();
                                port = Integer.parseInt(tokenizer.nextToken()) * 256 + Integer.parseInt(tokenizer.nextToken());
                            } catch (NumberFormatException e) {
                                System.out.println("1");
                                JOptionPane.showMessageDialog(null, "Compruebe que el servidor este disponible", "No hay servidor FTP", 0);
                            }
                            try {
                                Socket transfer = new Socket(address, port);
                                bufferedWriter.write("STOR " + file.getName() + "\r\n");
                                bufferedWriter.flush();
                                response = bufferedReader.readLine();
                                if (debug) {
                                    System.out.println(response);
                                }
                                if (response.startsWith("150")) {
                                    FileInputStream fileInputStream = new FileInputStream(file);
                                    final int BUFFER_SIZE = 1024;
                                    byte buffer[] = new byte[BUFFER_SIZE];
                                    int len = 0, off = 0;
                                    if (debug) {
                                        System.out.println("uploading file...");
                                    }
                                    while ((len = fileInputStream.read(buffer)) != -1) {
                                        transfer.getOutputStream().write(buffer, off, len);
                                    }
                                    transfer.getOutputStream().flush();
                                    transfer.close();
                                    bufferedWriter.write("QUIT\r\n");
                                    bufferedWriter.flush();
                                    bufferedReader.close();
                                    socket.close();
                                    System.out.println("Archivo Subido con éxito");
                                    break;
                                }
                            } catch (IOException e) {
                                System.out.println("2");

                                System.err.println(e);
                            }
                        }
                    }
                }
            } else {
                System.err.println(file + " no existe!");
            }
        } catch (MalformedURLException e) {
            System.out.println("3");

            JOptionPane.showMessageDialog(null, "Compruebe que el servidor este disponible", "No hay servidor FTP", 0);
        } catch (IOException e) {

            System.out.println("Error: Compruebe que el servidor ftp este disponible.");
            JOptionPane.showMessageDialog(null, "Compruebe que el servidor este disponible", "No hay servidor FTP", 0);
            JOptionPane.showMessageDialog(null, "Compruebe que el servidor este disponible", "No hay servidor FTP", 0);
        }
    }

    public static synchronized void downloadFileByFTP(String server, String user, String pass, String localPath, String remotePath) throws FileNotFoundException, MalformedURLException, IOException {
        try {
            System.out.println("Descargando " + remotePath);
            java.net.URL url = new java.net.URL("ftp://" + ClientProperties.getUserFtp() + ":" + ClientProperties.getPswFtp() + "@" + ClientProperties.getIpFtp() + ":" + ClientProperties.getPuertoFtp() + remotePath);
            java.net.URLConnection urlc = url.openConnection();
            BufferedInputStream in = new BufferedInputStream(urlc.getInputStream());
            FileOutputStream out = new FileOutputStream(localPath);

            int i = 0;
            byte[] bytesIn = new byte[1024];
            while ((i = in.read(bytesIn)) >= 0) {
                out.write(bytesIn, 0, i);
            }
            out.close();
            System.out.println("Archivo descargado con éxito");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Compruebe que el servidor este disponible", "No hay servidor FTP", 0);
            System.out.println(ex.getMessage());
        }
    }

}
