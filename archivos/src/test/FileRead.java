package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRead {
    public static void main(String[] args) {
        //Files.readString(null)
        Path path = Path.of("files","mensajes.txt");
        try {
            String content = Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            // TODO Auto-generated catch block

            System.out.println(e.getMessage());
        }
    }
}
