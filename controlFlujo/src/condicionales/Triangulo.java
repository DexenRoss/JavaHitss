package condicionales;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        // Determinar que tipo de triangulo es
        Scanner in = new Scanner(System.in);
        int l1,l2,l3;
        System.out.println("Ingrese lado 1");
        l1 = in.nextInt();
        System.out.println("Ingresa el lado 2");
        l2 = in.nextInt();
        System.out.println("Ingresa el lado 3");
        l3 = in.nextInt();
        in.close();

        if (l1==l2 && l1==l3) {
            System.out.println("Triangulo Equilatero");
        }else if (l1==l2 || l2 ==l3 || l1==l3) {
            System.out.println("Triangulo Isoseles");
        }else{
            System.out.println("Triangulo Escaleno");
        }
    }
}
