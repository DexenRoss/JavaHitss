package com.dexenross.springboot_course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dexenross.springboot_course.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/student")
    public Student student(){
        return new Student(
            "Emilio",
            "Java Developer",
            1
        );
    }

    @GetMapping("/course")
    public String course(){
        return "Curso intensivo de Spring Boot";
    }

    @GetMapping("/status")
    public String status(){
        return "Aprendiendo";
    }


}
