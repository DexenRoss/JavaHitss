package interfaces;

public interface Printer {
    //Constantes
    int MAX_USERS = 90;

    // Metodos abstractos
    void print();

    default void info(){
        System.out.println("Info");
    }

    // Metodos static
    static int sum(int a, int b){
        return a+b;
    }

    private void validate(){
        System.out.println("Valid.");
    }
}
