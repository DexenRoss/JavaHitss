package com.dexenross.springboot_course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dexenross.springboot_course.model.Student;
import com.dexenross.springboot_course.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository = repository;
    }

    public List<Student> showAll(){
        return repository.showAll();
    }

    public Optional<Student> findById(Long id){
        return repository.findById(id);
    }

    public Student create(
        String name,
        String tech,
        int day
    ){
        return repository.save(name, tech, day);
    }
}
