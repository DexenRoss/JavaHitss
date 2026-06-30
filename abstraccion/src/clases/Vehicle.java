package clases;

public abstract class Vehicle {
    /*private String model;

    protected Vehicle(String model) {
        this.model = model;
    }*/

    // Metodos abstractos
    public abstract void startEngine();


    // Metodos concretos
    public void stop(){
        System.out.println("Vehicle stop");
    }

    
}
