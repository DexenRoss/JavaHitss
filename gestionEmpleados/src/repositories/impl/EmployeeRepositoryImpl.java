package repositories.impl;

import java.util.Optional;

import models.Employee;
import repositories.Repository;

public class EmployeeRepositoryImpl implements Repository<Employee, Integer> {

    private final Employee[] employees = {
        new Employee(1,"Emilio Caballero","IT"),
        new Employee(2,"Juan Camaney","HR"),
        new Employee(3,"Eduardo Camelo","Sales"),
        new Employee(4,"Maria Magdalena","IT")
    };

    @Override
    public Optional<Employee> findById(Integer id) {
        if (id == null) {
            return Optional.empty();
        }
        for (Employee employee : employees) {
            if (employee.id().equals(id)) {
                return Optional.of(employee);
            }
        }
        return Optional.empty();
    }

}
