package operadores;

import variables.Persona;

public class Operandos {
    public static void main(String[] args) {
        int a =5, b=10;
        System.out.println("a: "+a);
        System.out.println("a++: "+ a++); // post-incremento
        System.out.println("Valor de a: "+ a);
        System.out.println("Valor de ++a: "+ ++a); // pre-incremento
        System.out.println("b: "+b);
        System.out.println("b--: "+ b--); // post-incremento
        System.out.println("Valor de b: "+ b);
        System.out.println("Valor de --b: "+ --b); // pre-incremento

        System.out.println("----------Operador Ternario-----------------");
        int edad = 19; // Se le puede cambiar el valor
        String mayorEdad;
        mayorEdad = edad>=18? "Mayor de edad" : "Menor de edad";
        System.out.println("Eres "+mayorEdad);
        
        System.out.println("--------InstanceOf------------");
        System.out.println(mayorEdad instanceof String);

        Persona persona = new Persona();
        System.out.println(persona instanceof Persona);

        System.out.println("-----------Uso de Parentesis----------------");

        int resultado = 3+5*6/(4-5)+5%2;
        System.out.println(resultado);
    }
}
