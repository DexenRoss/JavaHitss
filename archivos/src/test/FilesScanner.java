package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesScanner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("files/clientes.csv"))){
            while (sc.hasNextInt()) { //sc.hasNextLine()
                int number = sc.nextInt();
                System.out.println(number); //sc.nextLine()
            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
