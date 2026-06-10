package ciclos;

public class TablasMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabal de "+i+":");
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d x %d = %d%n",i,j,(i*j));
                
            }
            System.out.println("------------------------");
        }
    }
}
