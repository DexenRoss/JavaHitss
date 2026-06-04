package cadenas;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom1,nom2,nom3, res, nomA,nomB,nomC;

        System.out.println("Ingresa un nombre");
        nom1 = sc.next();
        System.out.println("Ingresa un nombre");
        nom2 = sc.next();
        System.out.println("Ingresa un nombre");
        nom3 = sc.next();
        sc.close();

        nomA = nom1.toUpperCase().charAt(1)+"."+nom1.substring(nom1.length()-2);
        nomB = nom2.toUpperCase().charAt(1)+"."+nom2.substring(nom2.length()-2);
        nomC = nom3.toUpperCase().charAt(1)+"."+nom3.substring(nom3.length()-2);
        res = nomA+"_"+nomB+"_"+nomC;
        System.out.println(res);
    }


}
