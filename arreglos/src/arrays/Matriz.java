package arrays;

public class Matriz {
    public static void main(String[] args) {
        int[][] numeros = new int[3][4];

        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[fila].length; col++) {
                numeros[fila][col] = fila + col;
                System.out.print(numeros[fila][col]);
            }
            System.out.println();
        }
        System.out.println("===============Con foreach=============");
        for (int[] filas : numeros) {
            for (int valores  : filas) {
                System.out.print(valores);
            }
            System.out.println();
        }

    }
}
