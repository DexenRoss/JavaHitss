package opciones;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu dia de la semana favorito en numero");
        int dia = sc.nextInt();
        sc.close();
        switch (dia) {
            case 1:
                System.out.println("El dia es Lunes");
                
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("Descansale es Domingo");
                break;
            default:
                System.out.println("Chanclas, lo lamento");
        }
    }
}
