package com.dexenross.springboot_course.exception;

public class InvalidStudentStateException extends RuntimeException {

    public InvalidStudentStateException(String message){
        super(message);
    }
    
}
