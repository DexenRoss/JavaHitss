package services;

import java.util.Optional;

import models.Employee;

public interface EmployeeService {
    Optional<Employee> findEmployee(Integer id);

    Optional<String> findEmployeeName(Integer id);

    void printEmployee(Integer id);
}
