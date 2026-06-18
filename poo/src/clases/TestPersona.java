package clases;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Emilio Caballero");
        persona.setEdad(26);
        persona.mostrar();
        
        System.out.println("--------------- objeto con llamada encadenada-----------------");
        Persona persona2 = new Persona();
        persona2.setNombre("Juan Perez").setEdad(30).mostrar();
    }
}
