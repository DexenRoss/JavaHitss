import java.util.ArrayList;
import java.util.List;

import models.Employee;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Emilio", 25000.00),
            new Employee("Mariana", 35000.00),
            new Employee("Liz", 45000.00)
        );    
        //Imperativa
        List<Double> increasedSalary = new ArrayList<>();
        for (Employee employee : employees) {
            double newSalary = employee.salary() *1.10;
            increasedSalary.add(newSalary);
        }
        System.out.println(increasedSalary);

        //Declarativa
        List<Double> increasedSalaries = employees.stream().map(e -> e.salary() * 1.10).toList();
        increasedSalaries.forEach(s -> System.out.println(s));
    }
}
