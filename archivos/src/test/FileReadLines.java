package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadLines {
    public static void main(String[] args) {
        //Files.lines(null)

        Path path = Path.of("files", "clientes.txt");
        try {
            var lines = Files.lines(path);
            lines.forEach(l -> System.out.println(l));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
