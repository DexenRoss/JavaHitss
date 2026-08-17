package com.dexenross.springboot_course.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateBookRequest(
    @NotBlank(message = "El isbn no puede estar vacio")
    String isbn,

    @NotBlank(message = "El titulo no puede estar en blanco")
    @Size(min=1,max=100)
    String title,

    @NotBlank(message = "Todo libro debe tener autor")
    String author
) {
    

}
