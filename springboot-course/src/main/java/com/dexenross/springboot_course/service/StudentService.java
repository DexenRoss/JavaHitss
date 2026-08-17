package com.dexenross.springboot_course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dexenross.springboot_course.exception.InvalidStudentStateException;
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
        if (day < 1) {
            throw new InvalidStudentStateException(
                "El dia del curso debe ser mayort o igual a 1"
            );
        }
        return repository.save(name, tech, day);
    }

    public Optional<Student> update(
        Long id,
        String name,
        String tech,
        int day
    ){
        Optional<Student> current = repository.findById(id);
        if (current.isEmpty()) {
            return Optional.empty();
        }
        if (day <current.get().day()) {
            throw new InvalidStudentStateException(
                "El estudiante no puede retroceder de dia en su aprendizaje"
            );
        }
        return repository.update(id, name, tech, day);
    }

    public boolean deleteById(Long id){
        return repository.deleteById(id);
    }

    public List<Student> findByTechnology(String tech){
        return repository.findByTechnology(tech);
    }

    public List<Student> findAllSortedByName(){
        return repository.findAllSortedName();
    }
}
