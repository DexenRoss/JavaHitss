package test;

import variables.Ejemplo;
import variables.Persona;

public class Principal {
    public static void main(String[] args) {
        Ejemplo ejemplo = new Ejemplo();
        Persona persona = new Persona();
        Persona persona2 = new Persona();

        ejemplo.mostrar();
        System.out.println("----------------Persona1---------------");
        persona.mostrar();
        
        System.out.println("------------Persona2-------------");
        persona2.mostrar();
        persona2.edad = 26;
        persona2.nombre="Emilio";
        persona2.mostrar();
    }
}
