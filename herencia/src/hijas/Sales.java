package hijas;

import java.util.Random;

import padre.Employee;

public class Sales extends Employee {
    private double salesMonth;
    private Random random = new Random();

    public Sales(String name, int age, double salary){
        super(name,age,salary);
        salesMonth = random.nextDouble();
    }

    public double getComission(){
        return salesMonth*.05;
    }

    public double getSalesMonth() {
        return salesMonth;
    }

}
