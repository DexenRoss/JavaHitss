package ciclos;

public class TrianguloInvertido {
    public static void main(String[] args) {
        //Mostrar un triangulo invertido de asteriscos
        int total = 5;
        for (int fila = total; fila > 0; fila--) {
            for(int columna =1;columna<=fila;columna++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
