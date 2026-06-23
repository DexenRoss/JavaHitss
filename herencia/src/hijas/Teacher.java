package hijas;

import padre.Person;

//Is-a --> Es una persona
public class Teacher extends Person{
    double salary;

    public Teacher(){
        super();
        System.out.println("Constructor Teacher");
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher salary:" + salary + ", \nName:" + getName() + ", \nAge:" + getAge();
    }

    @Override
    public void showInformation() {
        // TODO Auto-generated method stub
        super.showInformation();
        System.out.println("Name: %s\tAge: %d\tSalary: $%.2f".formatted(getName(),getAge(),salary));
    }

    
}
