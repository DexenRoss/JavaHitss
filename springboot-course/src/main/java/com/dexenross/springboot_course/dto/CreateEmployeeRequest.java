package com.dexenross.springboot_course.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateEmployeeRequest(
    
    @NotBlank(message = "El nombre es obligatorio")
    String name, 

    @NotNull(message = "El departamento es obligatorio")
    Long departmentId
) {

}
