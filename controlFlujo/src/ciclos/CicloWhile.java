package ciclos;

public class CicloWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i<51) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }
}
