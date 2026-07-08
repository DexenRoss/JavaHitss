package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("files/ventas.txt")); 
            writer.write("Venta 1");
            writer.newLine();
            writer.write("venta 2");
            writer.newLine();
            writer.write("venta 3");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally {
            if (writer != null) {
                writer.close();
            }
            
        }
        

    }
}
