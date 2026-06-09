package ciclos;

public class CicloFor {
    public static void main(String[] args) {
        System.out.println("Imprimir los numeros del 1 al 10");
        System.out.println("contando:");
        for (int i = 1; i < 11; i++) {
            System.out.print(i+" ");
            try {
                Thread.sleep(500); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
        System.out.println("Descontando");
        for (int i = 10; i > 0; i--) {
            System.out.print(i+" ");
            try {
                Thread.sleep(500); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
