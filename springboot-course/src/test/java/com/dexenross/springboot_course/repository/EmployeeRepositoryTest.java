package com.dexenross.springboot_course.repository;

import com.dexenross.springboot_course.model.Department;
import com.dexenross.springboot_course.model.Employee;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    void shouldFindEmployeesByDepartment() {

        // ARRANGE
        Department backend =
                departmentRepository.save(
                        new Department("Backend")
                );

        employeeRepository.save(
                new Employee(
                        "Emilio",
                        backend
                )
        );

        employeeRepository.save(
                new Employee(
                        "Ana",
                        backend
                )
        );

        // ACT
        List<Employee> employees =
                employeeRepository
                        .findByDepartmentId(
                                backend.getId()
                        );

        // ASSERT
        assertEquals(
                2,
                employees.size()
        );
    }

    @Test
    void shouldReturnEmptyListWhenDepartmentHasNoEmployees() {

        Department department =
                departmentRepository.save(
                        new Department("Ventas")
                );

        List<Employee> employees =
                employeeRepository
                        .findByDepartmentId(
                                department.getId()
                        );

        assertTrue(
                employees.isEmpty()
        );
    }

    @Test
    void shouldPersistEmployeeWithDepartment() {

        Department backend =
                departmentRepository.save(
                        new Department("Backend")
                );

        Employee employee =
                employeeRepository.save(
                        new Employee(
                                "Emilio",
                                backend
                        )
                );

        Optional<Employee> found =
                employeeRepository
                        .findById(
                                employee.getId()
                        );

        assertTrue(
                found.isPresent()
        );

        assertEquals(
                "Backend",
                found.get()
                        .getDepartment()
                        .getName()
        );
    }
}
