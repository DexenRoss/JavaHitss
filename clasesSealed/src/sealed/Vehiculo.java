package sealed;

import subclases.Tractocamion;

public sealed class Vehiculo permits Automovil, Motocicleta, Camion {
    public void conducir(){
        System.out.println("Estas conduciendo vehiculo.");
    }
}
