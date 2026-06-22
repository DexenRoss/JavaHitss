package clases;

public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado empleado2 = new Empleado(12000);
        Empleado empleado3 = new Empleado("Emilio");
        Empleado empleado4 = new Empleado("Emilio", 120000);
        empleado.mostrarInformacion();
        empleado2.mostrarInformacion();
        empleado3.mostrarInformacion();
        empleado4.mostrarInformacion();
    }
}
