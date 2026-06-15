package ciclos;

import java.util.Random;
import java.util.Scanner;

public class CicloDeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secreto=random.nextInt(100)+1, adivina;


        do {
            System.out.print("Advivina el numero secreto no mayor a 100:");
            adivina = sc.nextInt();
            if (adivina == secreto) {
                System.out.println("Adivinaste el numero secreto:"+secreto);
                sc.close();
                return;
            }
            if (adivina < secreto) {
                System.out.println("---------------------------");
                System.out.println("El numero secreto es mayor al que diste");
            }else{
                System.out.println("---------------------------");
                System.out.println("El numero secreto es menor al que diste");
            }
        } while (adivina != secreto);
        sc.close();
        
    }
}
