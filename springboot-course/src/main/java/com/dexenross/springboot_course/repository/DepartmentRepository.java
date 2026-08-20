package com.dexenross.springboot_course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dexenross.springboot_course.model.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {
}
