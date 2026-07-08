package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WritesLinesFile {
    public static void main(String[] args) throws IOException {
        List<String> lines = List.of("Juan","Pedro","Eloy","Bingo","Luis");

        Path path = Path.of("files", "clientes.txt");
        try {
            Files.write(path, lines);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
}
