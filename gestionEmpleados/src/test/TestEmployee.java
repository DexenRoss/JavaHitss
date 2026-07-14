package test;

import models.Employee;
import repositories.Repository;
import repositories.impl.EmployeeRepositoryImpl;
import repositories.impl.EmployeeServiceImpl;
import services.EmployeeService;

public class TestEmployee {
    public static void main(String[] args) {
        Repository<Employee, Integer> repository = new EmployeeRepositoryImpl();
        EmployeeService service = new EmployeeServiceImpl(repository);

        System.out.println("=========Buscar empleado============");
        service.printEmployee(1);
        System.out.println(service.findEmployee(6).orElse(new Employee(0,"Empty","N/A")));
        System.out.println("=============Nombre============");
        System.out.println(service.findEmployeeName(2).orElse("N/A"));
        
    }
}
