package Logica;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public abstract class SaveLoad {

    private static String archivo = "config.cfg";

    public static void save(Object[] datos) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));
        salida.writeObject(datos);
        salida.close();
    }

    public static void addHistorial(String string) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("historial.hs", true));
            
            out.write(new Date()+"\n-------------\n"+string+"-------------\n\n");
            
            out.close();
        } catch (IOException e) {
            System.out.println("no es posible escribir el historial");
        }
    }

    public static Object[] load() throws IOException, ClassNotFoundException {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
            Object[] datos = (Object[]) entrada.readObject();
            entrada.close();
            return datos;
        } catch (FileNotFoundException e) {
            System.out.println("Archivo de configuración inexistente, cargando valores predeterminados");
        }
        return null;
    }

    public static String getArchivo() {
        return archivo;
    }

    public static void setArchivo(String archivo) {
        SaveLoad.archivo = archivo;
    }

}
