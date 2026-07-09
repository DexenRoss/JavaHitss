package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
            new FileReader("files/clientes.csv")
        )){
            String line;
            while ((line = reader.readLine()) != null ) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
