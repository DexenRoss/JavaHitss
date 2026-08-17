package com.dexenross.springboot_course.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateStudentRequest(
    @NotBlank(message = "El nombre es Obligatorio")
    @Size(min=1, max=100)
    String name,

    @NotBlank(message = "La tecnologia es obligatoria")
    String technology,

    @Min(value = 1, message = "El primer dia es el 1")
    @Max(value = 15, message = "El ultimo dia es el 15")
    int day 
) {
}
