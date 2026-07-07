package test;

public class Test {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10/0; // Lanza la exepcion de tipo ArithmeticException
            System.out.println("funcionamineto correcto");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se permite una division entre 0");
        } catch(Exception e) {
            System.out.println("Error: Ocurrio un error generico");

        }

        System.out.println("Resultado fuera del try-catch: " + result);

    }
}
