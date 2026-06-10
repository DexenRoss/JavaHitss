package ciclos;

import java.util.Scanner;

public class Multimas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero:");
        int a = sc.nextInt();
        System.out.print("Dame otro numero:");
        int b = sc.nextInt();
        sc.close();
        int res =0;
        for (int i = Math.abs(a); i > 0; i--) {
            res+=b;
            System.out.println(res);
        }
        if (a<0) {
            res = -res;

        }
        System.out.println(res);
    }
}
