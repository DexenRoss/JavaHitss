package ciclos;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        System.out.println("Ingresa un numero");
        base = sc.nextInt();
        sc.close();
        System.out.println("Tablas de multiplicar del "+ base);
        for (int i = 1; i < 11; i++) {
            int res = base *i;
            System.out.println(base + " x "+i+" = "+ res);
        }
    }
}
