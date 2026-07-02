package test;

import classes.Developer;
//import classes.Calculator;
import classes.Employee;
import classes.Manager;
import interfaces.Adverticement;
import interfaces.Result;
import interfaces.Success;

public class Test {

    public static String show(Result result){
        String res = switch(result){
            case Success succes -> "Ok. "+succes.message();
            case interfaces.Error error -> "Error. "+error.message();
            case Adverticement adverticement -> "Adverticement. "+adverticement.message();
        };
        return res;
    }
    public static void main(String[] args) {
        /*Calculator calculator = new Calculator();
        calculator.suma(23, 34);
        calculator.suma(3454543465765L, 5L);
        Employee employee = new Manager();
        employee.calculateSalary();
        employee.work();
        employee.showInfo();

        Employee employee2 = new Developer();

        employee2.calculateSalary();
        employee2.work();
        employee2.showInfo();

        if (employee2 instanceof Manager manager) {
            manager.vacationsApproved();
        }
        Manager manager = (Manager) employee2;
        manager.vacationsApproved();*/

        Result result = new Success("Sale succeed");
        System.out.println(show(result));
        
    }
}
