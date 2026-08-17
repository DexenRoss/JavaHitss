package com.dexenross.springboot_course.model;

import jakarta.validation.constraints.NotBlank;

public record UpdateBookRequest(
    @NotBlank(message = "El ISBN no debe ser vacio")
    String isbn,

    @NotBlank(message = "Todo libro tiene titulo")
    String title,

    @NotBlank(message = "Todo libro tiene autor")
    String author
) {

}
