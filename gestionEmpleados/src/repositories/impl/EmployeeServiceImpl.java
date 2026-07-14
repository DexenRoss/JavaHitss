package repositories.impl;

import java.util.Optional;

import models.Employee;
import repositories.Repository;
import services.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    private final Repository<Employee, Integer> repository;
    

    public EmployeeServiceImpl(Repository<Employee, Integer> repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Employee> findEmployee(Integer id) {
        
        return repository.findById(id);
    }

    @Override
    public Optional<String> findEmployeeName(Integer id) {
        /*Optional<Employee> optional = repository.findById(id);
        return optional.ofNullable(optional.get().name());*/
        return repository.findById(id).map(Employee::name);
    }

    @Override
    public void printEmployee(Integer id) {
        repository.findById(id).ifPresent(e -> System.out.println(e));
       
    }

}
