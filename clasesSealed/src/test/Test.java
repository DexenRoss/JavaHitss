package test;

import sealed.Automovil;
import sealed.Camion;
import sealed.Deportiva;
import sealed.Motocicleta;
import sealed.Vehiculo;
import subclases.Tractocamion;

public class Test {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.conducir();
        Automovil automovil = new Automovil();
        automovil.conducir();
        Motocicleta motocicleta = new Motocicleta();
        motocicleta.conducir();
        Camion camion = new Camion();
        camion.conducir();
        Deportiva deportiva = new Deportiva();
        deportiva.conducir();
        Tractocamion tractocamion = new Tractocamion();
        tractocamion.conducir();
    }
}
