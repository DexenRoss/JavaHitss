package condicionales;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 23;
        if (numero % 2 == 0) { // se puede usar != para preguntar si es diferente
            System.out.println(numero+" es par");
        } else {
            System.out.println(numero+" es impar");
        }
    }
}
