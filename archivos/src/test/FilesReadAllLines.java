package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesReadAllLines {
    public static void main(String[] args) {
        //Files.readAllLines(null)
        Path path = Path.of("files", "ventas.txt");
        try {
           List <String> lines = Files.readAllLines(path);
           for (String string : lines) {
                System.out.println(string);
           }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
