package opciones;

import java.util.Scanner;

public class DiaLaborable {
    String dia;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaLaborable d = new DiaLaborable();
        System.out.println("Dame un dia de la semana:");
        d.dia = sc.nextLine();
        sc.close();
        String dia = d.dia.toLowerCase();
        // Sintaxis para java 14 en adelante, una sola instruccion, pero se especifica con {}
        switch (dia) {
            case "lunes","martes","miercoles","jueves","viernes" ->
                System.out.println(d.dia+" es dia laborable");
            case "sabado","domingo" ->
                System.out.println("En "+d.dia+" se descansa");
            default ->
                System.out.println("Ese dia no lo topamos");
        }
        // Sintaxis para java antes de java 14
        /*switch (dia) {
            case "lunes","martes","miercoles","jueves","viernes":
                System.out.println(d.dia+" es dia laborable");
                break;
            case "sabado","domingo":
                System.out.println("En "+d.dia+" se descansa");
                break;
            default:
                System.out.println("Ese dia no lo topamos");
                break;
        }*/
    }
}
