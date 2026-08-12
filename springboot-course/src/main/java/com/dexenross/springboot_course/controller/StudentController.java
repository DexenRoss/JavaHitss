package com.dexenross.springboot_course.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dexenross.springboot_course.model.CreateStudentRequest;
import com.dexenross.springboot_course.model.Student;

@RestController
@RequestMapping("/api")
public class StudentController {

    public final List<Student> students = new ArrayList<>();
    private long nextid = 1;

    @GetMapping("/student")
    public Student student(){
        return new Student(
            nextid,
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

    @GetMapping("/student/{id}")
    public String findStudent(@PathVariable Long id){
        return "Buscando estudiente con el ID: "+id;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "Mundo") String name){
        return "Hola "+ name;
    }

    /*@PostMapping("/students")
    public Student createStudent(
        @RequestBody CreateStudentRequest request
    ){
        return new Student(
            request.name(),
            request.technology(),
            request.day()
        );
    }*/

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(
        @RequestBody CreateStudentRequest request
    ){
        Student student = new Student(
            nextid++,
            request.name(),
            request.technology(),
            request.day()
        );

        students.add(student);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(student);
    }

    @GetMapping("/students")
    public List<Student> findAll(){
        return students;
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> findById(
        @PathVariable Long id
    ){
        return students.stream()
                .filter(s -> s.id().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    


}
