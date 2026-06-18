package clases;

public class TestEstudiante {
    public static void main(String[] args) {
        // Ciclo de vida de un objeto
        // 1. Declaracion de referencia
        Estudiante estudiante;

        // 2. Creacion del objeto
        estudiante = new Estudiante();

        //Estudiante estudiante2 = new Estudiante();

        //System.out.println(estudiante);
        //System.out.println(estudiante2);

        // 3. Uso del objeto
        System.out.println(estudiante.matricula+" - "+estudiante.nombre+" - "+estudiante.matricula);
        estudiante.matricula = "E001";
        estudiante.nombre = "Emilio";
        estudiante.carrera = "Computacion";
        estudiante.inscribirse();
        System.out.println(estudiante.matricula+" - "+estudiante.nombre+" - "+estudiante.matricula);

        // 4. Objeto sin referencia

        estudiante = null;
        System.out.println(estudiante.matricula);

        // 5. Recoleccion de basura (Garbage Collector)
        // System.gc();

    }
}
