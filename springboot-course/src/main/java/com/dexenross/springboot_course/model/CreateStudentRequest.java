package com.dexenross.springboot_course.model;

public record CreateStudentRequest(
    String name,
    String technology,
    int day 
) {
}
