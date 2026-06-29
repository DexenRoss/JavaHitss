package sealed;

/**
 * Motocicleta
 */
public sealed class Motocicleta extends Vehiculo permits Deportiva {

    @Override
    public void conducir() {
        // TODO Auto-generated method stub
        System.out.println("Conduciendo una motocicleta");
    }

}
