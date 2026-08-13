package com.dexenross.springboot_course.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.dexenross.springboot_course.model.Student;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();
    private long nextId = 1;

    public StudentRepository() {
        students.add(
                new Student(
                        nextId++,
                        "Emilio",
                        "Spring Boot",
                        4
                )
        );

        students.add(
                new Student(
                        nextId++,
                        "Ana",
                        "Java",
                        3
                )
        );

        students.add(
                new Student(
                        nextId++,
                        "Carlos",
                        "Spring Boot",
                        2
                )
        );
    }

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

    public Optional<Student> update(
        Long id,
        String name,
        String tech,
        int day
    ){
        for (int i = 0; i < students.size(); i++) {
            Student current = students.get(i);

            if (current.id().equals(id)) {
                Student updated = new Student(
                    id,
                    name,
                    tech,
                    day
                );
                students.set(i, updated);

                return Optional.of(updated);
            }
        }
        return Optional.empty();
    }

    public boolean deleteById(Long id){
        return students.removeIf(
            s -> s.id().equals(id)
        );
    }

    public List<Student> findByTechnology(String technology){
        return students.stream()
                .filter(s ->
                    s.technology().equalsIgnoreCase(technology)
                )
                .toList();
    }

    public List<Student> findAllSortedName(){
        return students.stream()
                    .sorted(
                        Comparator.comparing(Student::name)
                    )
                    .toList();
    }
}
