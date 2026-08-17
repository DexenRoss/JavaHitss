package com.dexenross.springboot_course.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record UpdateStudentRequest(
    @NotBlank(message = "El nombre es obligarorio")
    String name,

    @NotBlank(message = "La tecnologia es obligatoria")
    String technology,

    @Min(value = 1, message = "El día debe ser mínimo 1")
    @Max(value = 15, message = "El día debe ser máximo 15")
    int day
) {

}
