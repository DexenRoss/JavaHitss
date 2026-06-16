package ciclos;

import java.util.Scanner;

public class ValidarDatos {
    public static void main(String[] args) {
        String pass, valid="1234";
        Scanner sc = new Scanner(System.in);
        int intentos =1;
        while (intentos <=3) {
            System.out.print("Teclea tu contrasenia:");
            pass = sc.nextLine();
            if (pass.equals(valid)) {
                System.out.println("Acceso Concedido");
                return;
                
            }
            System.out.println("Contrasenia incorrecta");
            intentos++;
            
            
        }
        sc.close();
        System.out.println("Bloqueado Temporalmente");
        
    }
}
