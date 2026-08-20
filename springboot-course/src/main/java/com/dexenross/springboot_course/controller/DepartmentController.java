package com.dexenross.springboot_course.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dexenross.springboot_course.dto.CreateDepartmentRequest;
import com.dexenross.springboot_course.model.Department;
import com.dexenross.springboot_course.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(
            DepartmentService service
    ) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Department> create(
            @RequestBody CreateDepartmentRequest request
    ) {

        Department department =
                service.create(request.name());

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(department);
    }
}
