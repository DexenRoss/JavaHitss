package com.dexenross.springboot_course.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.dexenross.springboot_course.model.Student;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();
    private long nextId = 1;

    public List<Student> showAll(){
        return students;
    }

    public Optional<Student> findById(Long id){
        return students.stream()
                .filter(s->s.id().equals(id))
                .findFirst();
    }

    public Student save(
        String name,
        String tech,
        int day
    ){
        Student student = new Student(
            nextId++,
            name,
            tech,
            day
        );

        students.add(student);
        return student;
    }
}
