package com.dexenross.springboot_course.service;

import com.dexenross.springboot_course.model.Department;
import com.dexenross.springboot_course.model.Employee;
import com.dexenross.springboot_course.dto.EmployeeResponse;
import com.dexenross.springboot_course.repository.DepartmentRepository;
import com.dexenross.springboot_course.repository.EmployeeRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private DepartmentRepository departmentRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    void shouldCreateEmployeeWhenDepartmentExists() {

        // ARRANGE
        Department department =
                new Department("Backend");

        when(departmentRepository.findById(1L))
                .thenReturn(Optional.of(department));

        when(employeeRepository.save(any(Employee.class)))
                .thenAnswer(invocation ->
                        invocation.getArgument(0)
                );

        // ACT
        EmployeeResponse response =
                employeeService.create(
                        "Emilio",
                        1L
                );

        // ASSERT
        assertEquals(
                "Emilio",
                response.name()
        );

        assertEquals(
                "Backend",
                response.departmentName()
        );

        verify(departmentRepository)
                .findById(1L);

        verify(employeeRepository)
                .save(any(Employee.class));
    }

    @Test
    void shouldNotCreateEmployeeWhenDepartmentDoesNotExist() {

        // ARRANGE
        when(departmentRepository.findById(99L))
                .thenReturn(Optional.empty());

        // ACT + ASSERT
        assertThrows(
                IllegalArgumentException.class,
                () -> employeeService.create(
                        "Emilio",
                        99L
                )
        );

        verify(employeeRepository, never())
                .save(any(Employee.class));
    }
}
