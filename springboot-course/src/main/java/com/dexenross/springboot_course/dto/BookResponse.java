package com.dexenross.springboot_course.dto;

public record BookResponse(
        Long id,
        String isbn,
        String title,
        String author
) {
}
