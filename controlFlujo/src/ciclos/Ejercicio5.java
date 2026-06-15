package ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido");
            System.out.println("----------------------");
            System.out.println("1.- Actualizar");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Crear");
            System.out.println("4.- Listar");
            System.out.println("5.- Salir");
            System.out.print("opciona a realizar: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Usuario Actualizado Correctamente");
                    break;
                case 2:
                    System.out.println("Usuario Eliminado Correctamente");
                    break;
                case 3:
                    System.out.println("Usuario Creado Correctamente");
                    break;
                case 4:
                    System.out.println("Una lista tremenda de usuarios");
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro servicio, Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        sc.close();
    }
}
