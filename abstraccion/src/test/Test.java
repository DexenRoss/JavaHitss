package test;

import clases.Car;
import clases.Circle;
import clases.Vehicle;
import clases.Shape;
import clases.Square;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stop();

        Vehicle vehicle = new Car();
        vehicle.startEngine();
        vehicle.stop();

        System.out.println("======Shapes========");
        Shape circle = new Circle(5);
        circle.area();
        circle.show();
        Shape square = new Square(7);
        square.area();
        square.show();
    }
}
