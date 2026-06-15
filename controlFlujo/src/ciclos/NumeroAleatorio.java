package ciclos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class NumeroAleatorio {
    public static void main(String[] args) {
        // 1. Math.random()
        System.out.println("Con Math.random()");
        System.out.println("---------------------------");
        double numero = Math.random();
        System.out.println("Numero random con Math.random():" +numero);

        // numeros enteros con Math.random()
        int numEntero = (int) (numero*100);
        System.out.println(" Numero random casteado a int de Math.random()*100:"+numEntero);
        System.out.println("---------------------------");

        // 2. Clase Random
        System.out.println("Clase Random");
        System.out.println("---------------------------");
        Random aleatorio = new Random();
        numEntero = aleatorio.nextInt();
        System.out.println("Numero con Random:"+numEntero);

        numEntero = aleatorio.nextInt(100)+1;
        System.out.println("Numero con Random con rango de 1 a 100:"+numEntero);
        numero = aleatorio.nextDouble();
        System.out.println("Numero con Random con de 0 a 1:"+numero);
        System.out.println("---------------------------");

        // 3. ThreadLocalRandom 
        System.out.println("ThreadLocalRandom");
        numEntero = ThreadLocalRandom.current().nextInt(1,101);
        numero = ThreadLocalRandom.current().nextDouble();
        System.out.println("Numero Random con ThreadLocalRandom.current().nextInt() con rango del 1 al 100:"+numEntero);
        System.out.println("Numero random con ThreadLocalRandom.current.nextDouble() con decimales"+numero);
        System.out.println("---------------------------");

        // 4. Clase RandomGenerator
        System.out.println("Clase RandomGenerator");
        RandomGenerator random = RandomGenerator.getDefault();

        numEntero = random.nextInt(1,101);
        numero = random.nextDouble(1.0,100.0);
        System.out.println("Numero random con RandomGenerator en un rango del 1 a 100:"+numEntero);
        System.out.println("Numero random con RandomGenerator con decimal con rango de 1 a 100:"+numero);
    }
}
