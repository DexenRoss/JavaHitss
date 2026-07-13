package genericos.interfaces.implementations;

import classes.Employee;
import genericos.interfaces.Repository;

public class EmployeeRepository implements Repository<Employee> {

    @Override
    public void save(Employee entity) {
        System.out.println("Save....");
    }

    @Override
    public Employee findById(Long id) {
        return new Employee(1L,"Default");
    }

}
