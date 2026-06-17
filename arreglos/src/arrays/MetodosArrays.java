package arrays;

import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        String[] nombres = {"Emilio","Bingo","Luisa", "Fernando","Paco","Esmeralda"};
        int[] numeros = {5,10,45,12,14,60,80,2,20,11};
        int[] edades = new int[10];
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};


        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("====Clase Arrays====");

        System.out.println("==toString()==");

        //Clase Arrays
        System.out.println(Arrays.toString(nombres));

        System.out.println("====sort(array)=====");
        Arrays.sort(nombres);
        System.out.println(Arrays.toString(nombres));

        System.out.println("====Ordenar arreglos=====");
        System.out.println("Arreglo: "+Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado con sort(): "+Arrays.toString(numeros));

        System.out.println("====Arrays.fill(array, valor)====");
        System.out.println("Arreglo vacio: "+Arrays.toString(edades));
        Arrays.fill(edades, 2,5,10);
        System.out.println("Arreglo lleno con fil(): "+Arrays.toString(edades));

        System.out.println("====Arrays.binarySearch(array,valor a buscar)");
        System.out.println("El indice de 14 en "+Arrays.toString(numeros)+" es "+Arrays.binarySearch(numeros, 14));
        System.out.println("El indice de 7 en "+Arrays.toString(numeros)+" es "+Arrays.binarySearch(numeros, 7));
        Arrays.sort(nombres);
        System.out.println("El indice de Emilio en "+Arrays.toString(nombres)+" es "+Arrays.binarySearch(nombres, "Emilio"));

        System.out.println("====Arrays.copyOf()====");
        int[] copia = Arrays.copyOf(numeros,numeros.length);
        System.out.println("Esto es un acopia "+Arrays.toString(copia));

        System.out.println("====Matrices===");
        System.out.println(Arrays.deepToString(matriz));
    }
}
