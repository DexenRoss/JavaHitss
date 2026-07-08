package test;

import java.nio.file.Files;
import java.nio.file.Path;

public class TestFile {
    public static void main(String[] args) {
        // java.io --> Java 1
        // java.nio --> Java 4
        // java.nio.file -> Java 7
        Path path = Path.of("src","test","TestFile.java");
        System.out.println(Files.exists(path));
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getName(1));
        System.out.println(path.startsWith("src"));
        System.out.println(path.endsWith("TestFile.java"));
    }
}
