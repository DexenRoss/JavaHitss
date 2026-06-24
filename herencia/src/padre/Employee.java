package padre;

import java.util.Random;

public class Employee extends Person{
    private double salary;
    private static int idEmployee = 0;
    private Random random = new Random();

    public Employee(){
        
    }

    public Employee(String name, int age, double salary) {
        super(name, age);
        try {
            if (salary <= 0) {
                this.salary = random.nextDouble();
                throw new IllegalArgumentException("There can't be negative salary, a random salary would be select");   
            } else {
                this.salary = salary;
            }  
        } catch (Exception e) {
            System.out.println("Error handled by constructor: "+e.getMessage());
        }
        
        idEmployee++;
    }

    public double getSalary() {
        return salary;
    }
    
    public double calculateBonusYear(){
        return salary *.10;
    }

    public static int getIdEmployee() {
        return idEmployee;
    }
    
}
