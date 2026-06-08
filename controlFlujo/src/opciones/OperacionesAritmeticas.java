package opciones;

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        int a,b;
        char operador;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingresa el valor de a:");
        a = sc.nextInt();
        System.out.println("Ingresa el valor de b");
        b = sc.nextInt();
        System.out.println("Ingresa un operador para a y b (+,-,*,/,%)");
        operador = sc.next().charAt(0);
        sc.close();
        switch (operador) {
            case '+' -> System.out.println("a + b = "+(a+b));
            case '-' -> System.out.println("a - b = "+(a-b));
            case '*' -> System.out.println("a * b = "+(a*b));
            case '/' -> {if (b == 0) {
                System.out.println("Resultado no definido, b = 0");
            }else{
                System.out.println("a / b = " + (a/b));
            }}
            case '%' -> {if (b == 0) {
                System.out.println("Resultado no definido, b = 0");
            }else{
                System.out.println("a / b = " + (a/b));
            }}
        
            default -> System.out.println("operador no disponible");
        }

    }
}
