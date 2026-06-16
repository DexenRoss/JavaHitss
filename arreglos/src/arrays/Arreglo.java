package arrays;

public class Arreglo {
    public static void main(String[] args) {
        // Declarar el arreglo
        int[] numeros; // o int numeros[]

        // Inicializacion o reserva de espacio de memoria de tamanio 5
        numeros = new int[5];

        // Asignacion de valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        //numeros[5] = 60;
        //numeros[-1] = -10;

        // Recorrer el arreglo con for
        System.out.println("con for");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        } 
        System.out.println("-----------------------------");
        // Recorrer el arreglo usando foreach
        System.out.println("con foreach");
        int suma=0;
        for (int i : numeros) {
            suma += i;
            System.out.println(i);
            System.out.println("la suma va en: "+ suma);
        }
    }
}
