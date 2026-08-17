package com.dexenross.springboot_course.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String technology;
    @Column(name = "course_day")
    private int day;

    protected Student(){}

    public Student(
        String name,
        String technology,
        int day
    ){
        this.name = name;
        this.technology = technology;
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechnology() {
        return technology;
    }

    public int getDay() {
        return day;
    }

    public void update(
        String name,
        String technology,
        int day
    ){
        this.name = name;
        this.technology=technology;
        this.day = day;
    }
}
