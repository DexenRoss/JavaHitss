package condicionales;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char caracter;
        System.out.println("Ingresa un solo caracter");
        caracter = in.next().charAt(0);
        in.close();
        if(Character.isLetter(caracter)){
            char c = Character.toLowerCase(caracter);
            switch (c) {
                case 'a','e','i','o','u':
                    System.out.println(caracter+" Es una vocal");
                    break;
            
                default:
                    System.out.println(caracter+" Es una consonante");
                    break;
            }
            /* 
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                System.out.println(caracter+" Es una vocal");
            }else{
                System.out.println(caracter+" Es una consonante");
            }  
            */    
        }else if(Character.isDigit(caracter)){
            System.out.println(caracter+" Es un digito");
        }else{
            System.out.println(caracter+ " Es un caracter especial");
        }
    }
}
