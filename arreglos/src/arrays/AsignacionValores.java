package arrays;

public class AsignacionValores {
    public static void main(String[] args) {
        int[] numeros={10,20,30,40,50,60,70,80,90,100};
        for (int i : numeros) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}
