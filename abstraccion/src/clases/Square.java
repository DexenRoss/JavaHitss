package clases;

public class Square extends Shape{
    private int side;
    
    public Square(int side) {
        if (side <=0) {
            System.out.println("Side cannot be negative or 0");
        }else{
            this.side = side;
        }
        
    }
    
    @Override
    public double area() {
        // TODO Auto-generated method stub
        return side *side;
    }
}
