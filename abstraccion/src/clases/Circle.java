package clases;

public class Circle extends Shape {
    private double radius;

    
    public Circle(double radius) {
        if (radius <=0) {
            System.out.println("Radius cannot be negative o zero.");
        }else{
            this.radius = radius;
        }
    }


    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }
}
