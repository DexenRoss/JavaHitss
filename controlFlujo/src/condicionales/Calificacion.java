package condicionales;

public class Calificacion {
    public static void main(String[] args) {
        int nota = 96;
        if (nota>=90) {
            System.out.println("Excelente");
        } else if (nota>=80) {
            System.out.println("Notable");
        } else if (nota>=70) {
            System.out.println("Regular");
        } else {
            System.out.println("No Acreditado");   
        }
    }
}
