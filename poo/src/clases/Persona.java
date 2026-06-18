package clases;

public class Persona {
    String nombre;
    int edad;

    // Metodos para la llamda de encadenamineto
    public Persona setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public Persona setEdad(int edad){
        this.edad = edad;
        return this;
    }

    public Persona mostrar(){
        System.out.println(nombre + " - "+edad);
        return this;
    }
}
