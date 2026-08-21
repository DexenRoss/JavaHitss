package com.dexenross.springboot_course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dexenross.springboot_course.dto.EmployeeResponse;
import com.dexenross.springboot_course.model.Department;
import com.dexenross.springboot_course.model.Employee;
import com.dexenross.springboot_course.repository.DepartmentRepository;
import com.dexenross.springboot_course.repository.EmployeeRepository;

import org.springframework.transaction.annotation.Transactional;

import com.dexenross.springboot_course.exception.ResourceNotFoundException;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(
            EmployeeRepository repository,
            DepartmentRepository departmentRepository
    ) {
        this.repository = repository;
        this.departmentRepository =
                departmentRepository;
    }

    public EmployeeResponse create(
            String name,
            Long departmentId
    ) {

        Department department =
                departmentRepository
                        .findById(departmentId)
                        .orElseThrow(() ->
                                new IllegalArgumentException(
                                        "Departamento no encontrado"
                                )
                        );

        Employee employee =
                new Employee(name, department);

        Employee saved =
                repository.save(employee);

        return toResponse(saved);
    }

    private EmployeeResponse toResponse(
            Employee employee
    ) {

        return new EmployeeResponse(
                employee.getId(),
                employee.getName(),
                employee.getDepartment().getId(),
                employee.getDepartment().getName()
        );
    }

    @Transactional(readOnly = true)
    public List<EmployeeResponse> findByDepartment(
                Long departmentId
    ) {

                return repository
                        .findByDepartmentId(departmentId)
                        .stream()
                        .map(this::toResponse)
                        .toList();
    }

        public EmployeeResponse findById(Long id) {

        Employee employee =
                repository.findById(id)
                        .orElseThrow(() ->
                                new ResourceNotFoundException(
                                        "Employee " + id
                                )
                        );

        return toResponse(employee);
    }
}
