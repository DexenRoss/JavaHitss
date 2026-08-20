package com.dexenross.springboot_course.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dexenross.springboot_course.dto.CreateEmployeeRequest;
import com.dexenross.springboot_course.dto.EmployeeResponse;
import com.dexenross.springboot_course.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(
            EmployeeService service
    ) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EmployeeResponse> create(
            @RequestBody CreateEmployeeRequest request
    ) {

        EmployeeResponse employee =
                service.create(
                        request.name(),
                        request.departmentId()
                );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(employee);
    }

    @GetMapping("/department/{departmentId}")
    public List<EmployeeResponse> byDepartment(
            @PathVariable Long departmentId
    ) {
        return service.findByDepartment(
                departmentId
        );
    }
}
