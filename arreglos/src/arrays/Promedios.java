package arrays;

import java.util.Random;

public class Promedios {
    public double[][] promedios = new double[20][4];
    public double[] prom = new double[20];

    public void rellenar(double[][] mat){
        Random random = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = random.nextDouble(10)+1;
            }
        }
    }

    public void promedioEstudiante(double[][] mat){
        double[] promedios = new double[20];

        for (int i = 0; i < mat.length; i++) {
            int suma = 0;
            for (int j = 0; j < mat[i].length; j++) {
                suma += mat[i][j];                
            }
            double prom =(double)suma/mat[i].length;
            promedios[i] = prom;            
        }
        System.out.println("====Promedios====");
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Promedio del alumno "+i+": "+promedios[i]);
        }
        prom = promedios;
    }

    public void promedioMateria(double[][] mat) {
        double[] promediosMaterias = new double[mat[0].length];

        for (int j = 0; j < mat[0].length; j++) {
            int suma = 0;

            for (int i = 0; i < mat.length; i++) {
                suma += mat[i][j];
            }

            double promedio = (double) suma / mat.length;
            promediosMaterias[j] = promedio;
        }

        System.out.println("==== Promedios por materia ====");

        for (int j = 0; j < promediosMaterias.length; j++) {
            System.out.println("Promedio de la materia " + (j + 1) + ": " + promediosMaterias[j]);
        }
    }

    public void mejorPromedio(double[] aux) {
        double max = aux[0];
        int alumno = 0;

        for (int i = 1; i < aux.length; i++) {
            if (aux[i] > max) {
                max = aux[i];
                alumno = i;
            }
        }

        System.out.println("==== Mejor promedio ====");
        System.out.println("El mejor promedio es del alumno " + (alumno) + ": " + max);
    }

    public static void main(String[] args) {
        Promedios p = new Promedios();
        p.rellenar(p.promedios);
        p.promedioEstudiante(p.promedios);
        p.promedioMateria(p.promedios);
        p.mejorPromedio(p.prom);
    }
}
