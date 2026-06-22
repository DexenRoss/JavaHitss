package clases;

public class Empleado {
    String nombre;
    double salario;
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public Empleado(String nombre) {
        this(nombre,100);
        //this.nombre = nombre;
    }
    public Empleado(double salario) {
        this("Test 2",salario);
        //this.salario = salario;
    }
    public Empleado() {
        this("Test 1",100);
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: %s\tSalario: $%.2f".formatted(nombre,salario));
    }
}
