package com.dexenross.springboot_course.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    private String name;

    protected Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @OneToMany(
        mappedBy = "department",
        fetch = FetchType.LAZY
    )
    private List<Employee> employees;
}
