package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestArchivo {
    public static void main(String[] args) throws IOException{
        leerArchivo();
        System.out.println("Despues de leer el archivo");
    }

    public static void leerArchivo() throws IOException {
        FileReader reader = null;
        //Files files = null;
         
        try {
            Files.readString(Path.of("files/archivo.txt"));
            //reader = new FileReader("files/archivo.txt");
            System.out.println("Archivo leido correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace(); // Propagamos la excepcion
        } finally{
            if (reader != null) {
                System.out.println("Cerrando el archivo...");
                //reader.close(); // Cierra el archivo
            }
        }
    }
}
