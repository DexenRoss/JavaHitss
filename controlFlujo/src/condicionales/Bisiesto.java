package condicionales;

import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        // Determinar si un anio es biciesto
        Scanner in = new Scanner(System.in);
        int year;
        System.out.println("Ingresa un anio");
        year = in.nextInt();
        in.close();

        if ((year%4 == 0 && year%100!=0) || year%400==0) {
            System.out.println("El anio "+year+" es bisiesto");
        }else{
            System.out.println("El anio "+year+" es no bisiesto");
        }
    }
}
