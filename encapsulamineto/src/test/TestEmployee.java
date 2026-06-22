package test;

import clases.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
    
        employee.setName("Emilio");
        employee.setSalary(1000.0);
        double salary = employee.getSalary();
        System.out.println(salary);

        employee.showInformation();
    }
}
