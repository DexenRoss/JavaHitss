package arrays;

import java.util.Arrays;

public class MetodosArrays {
    public static void main(String[] args) {
        String[] nombres = {"Emilio","Bingo","Luisa", "Fernando","Paco","Esmeralda"};
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

    }
}
