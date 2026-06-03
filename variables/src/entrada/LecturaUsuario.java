package entrada;

import java.util.Scanner;

public class LecturaUsuario {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double sueldo;
        Scanner sc = new Scanner(System.in);
        // se puede cambier el println por print si solo quieren que este en la misma linea
        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu edad:");
        edad = sc.nextInt();
        System.out.println("ingresa tu sueldo:");
        sueldo = sc.nextDouble();
        sc.close();

        System.out.println("Hola, "+nombre+" tienes "+edad+" y tu sueldo es $"+sueldo);
    }
}
