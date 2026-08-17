package com.dexenross.springboot_course.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(org.springframework.web.bind.MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleInvalidState(
        org.springframework.web.bind.MethodArgumentNotValidException ex,
        HttpServletRequest request
    ){
        String message = ex.getBindingResult()
                                .getFieldErrors()
                                .stream()
                                .findFirst()
                                .map(error -> error.getField()
                                        +": "
                                        + error.getDefaultMessage())
                                .orElse("Datos invalidos");
           
        ApiError error = new ApiError(
            LocalDateTime.now(),
            HttpStatus.BAD_REQUEST.value(),
            "VALIDATION_ERROR",
            message,
            request.getRequestURI()
        ); 

        return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error);
    }
}
