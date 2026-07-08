package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {
    public static void main(String[] args) {
        Path path = Path.of("files", "mensajes.txt");
        String line = "Primera linea\nHola Java 21\nEscribiendo";
        try {
            if (Files.exists(path)) {
                Files.writeString(path, line);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        //Files.writeString(null, null, null)
        //Files.write(null, null, null)
        //BufferedWriter
        //FileWriter
        //PrintWriter
    }
}
