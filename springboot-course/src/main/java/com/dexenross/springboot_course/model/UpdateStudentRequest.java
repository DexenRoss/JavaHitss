package com.dexenross.springboot_course.model;

public record UpdateStudentRequest(
    String name,
    String technology,
    int day
) {

}
