package com.dexenross.springboot_course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
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
        return repository.findAll();
    }

    public Optional<Student> findById(Long id){
        return repository.findById(id);
    }

    public Student create(
        String name,
        String tech,
        int day
    ){
        Student s = new Student(name, tech, day);
        return repository.save(s);
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

        Student s = current.get();
        if (day <s.getDay()) {
            throw new InvalidStudentStateException(
                "El estudiante no puede retroceder de dia en su aprendizaje"
            );
        }
        s.update(name, tech, day);
        Student updated = repository.save(s);
        
        return Optional.of(updated);
    }

    public boolean deleteById(Long id){
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);

        return true;
    }

    public List<Student> findByTechnology(String tech){
        return repository.findByTechnologyIgnoreCase(tech);
    }

    public List<Student> findAllSortedByName(){
        return repository.findAll(
            Sort.by(Sort.Direction.ASC, "name")
        );
    }
}
