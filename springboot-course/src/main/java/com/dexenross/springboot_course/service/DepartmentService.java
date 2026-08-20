package com.dexenross.springboot_course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dexenross.springboot_course.model.Department;
import com.dexenross.springboot_course.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(
            DepartmentRepository repository
    ) {
        this.repository = repository;
    }

    public Department create(String name) {
        return repository.save(
                new Department(name)
        );
    }

    public List<Department> findAll() {
        return repository.findAll();
    }
}
