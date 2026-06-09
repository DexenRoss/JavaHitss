package opciones;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cuenta = 5000;
        int opcion = 0;
        while (opcion !=4) {
            System.out.println("==== CAJERO AUTOMATICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero.");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su cuenta es de $"+cuenta+" pesos");
                    break;
                case 2:
                    System.out.println("Dinero a depositar:");
                    double ingreso = sc.nextDouble();
                    cuenta += ingreso;
                    System.out.println("Su saldo es de $"+(cuenta)+" pesos");
                    break;
                case 3:
                    System.out.println("Dinero a retirar");
                    double retiro = sc.nextDouble();
                    if (retiro > cuenta) {
                        System.out.println("Saldos insuficientes");
                    }else{
                        cuenta -= retiro;
                        System.out.println("Retiro exitoso, su cuenta es de $"+cuenta+" pesos");
                    }
                    break;
                case 4:
                    opcion =4;
                    System.out.println("Adios");
                    sc.close();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("===========ADVERTENCIA INTENTO DE HACKEO============");
                    break;
            }
        }
    }
}
