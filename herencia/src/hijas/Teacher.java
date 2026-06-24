package hijas;

import classes.Career;
import padre.Employee;
import padre.Person;

//Is-a --> Es una persona
// Person --> Employee --> Teacher
public class Teacher extends Employee{

    private Career career;

    public Teacher(){
        //super();
        //System.out.println("Constructor Teacher");
    }

    public Teacher(String name, int age, double salary) {
        super(name, age,salary);
        //this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher salary:" + getSalary() + ", \nName:" + getName() + ", \nAge:" + getAge();
    }

    @Override
    public void showInformation() {
        // TODO Auto-generated method stub
        super.showInformation();
        System.out.println("Name: %s\tAge: %d\tSalary: $%.2f".formatted(getName(),getAge(),getSalary()));
    }

    
}
