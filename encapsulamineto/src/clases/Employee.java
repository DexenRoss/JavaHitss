package clases;

public class Employee {
    private String name;
    private double salary;

    // Metodos getters y setters

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Metodos logicos
    public void showInformation(){
        System.out.println("Name: %s\tSalary: $%.2f".formatted(name,salary));
    }

    
}
