package com.dexenross.springboot_course.repository;

import java.util.List;

import com.dexenross.springboot_course.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartmentId(
            Long departmentId
    );
}
