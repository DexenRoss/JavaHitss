package com.dexenross.springboot_course.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dexenross.springboot_course.model.CreateStudentRequest;
import com.dexenross.springboot_course.model.Student;
import com.dexenross.springboot_course.model.UpdateStudentRequest;
import com.dexenross.springboot_course.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    //public final List<Student> students = new ArrayList<>();
    //private long nextid = 1;

    private final StudentService service;

    public StudentController(StudentService s){
        service = s;
    }

    @GetMapping
    public List<Student> showAll(){
        return service.showAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(
        @PathVariable Long id
    ){
        return service.findById(id)
                    .map(ResponseEntity::ok)
                    .orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Student> create(
        @Valid @RequestBody CreateStudentRequest request
    ){
        Student student = service.create(
            request.name(),
            request.technology(), 
            request.day()
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(
        @PathVariable Long id,
        @Valid @RequestBody UpdateStudentRequest request
    ){
        return service.update(
            id,
            request.name(), 
            request.technology(),
            request.day()
        )
        .map(ResponseEntity::ok)
        .orElseGet(()-> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
        @PathVariable Long id
    ){
        boolean delete  = service.deleteById(id);

        if (!delete) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<Student> search(
        @RequestParam String tech
    ){
        return service.findByTechnology(tech);
    }

    @GetMapping("/sorted")
    public List<Student> findAllSorterd(){
        return service.findAllSortedByName();
    }





    /*@GetMapping("/student")
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
    }*/

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

    /*@PostMapping("/students")
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
    }*/
    


}
