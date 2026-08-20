package com.dexenross.springboot_course.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dexenross.springboot_course.dto.BookResponse;
import com.dexenross.springboot_course.dto.CreateBookRequest;
import com.dexenross.springboot_course.dto.UpdateBookRequest;
import com.dexenross.springboot_course.model.Book;
import com.dexenross.springboot_course.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService service;

    public BookController(BookService b){
        service = b;
    }

    @GetMapping
    public List<BookResponse> showAll(){
        return service.showAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(
        @PathVariable Long id
    ){
        return service.findById(id)
                    .map(ResponseEntity::ok)
                    .orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Book> create(
        @Valid @RequestBody CreateBookRequest request
    ){
        Book book = service.create(
            request.isbn(),
            request.title(),
            request.author()
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> update(
        @PathVariable Long id,
        @Valid @RequestBody UpdateBookRequest request
    ){
        return service.update(
            id,
            request.isbn(),
            request.title(),
            request.author()
        )
        .map(ResponseEntity::ok)
        .orElseGet(()-> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
        @PathVariable Long id
    ){
        boolean delete  = service.deleteById(id);

        if (!delete) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public Page<Book> search(
        @RequestParam String title,
        Pageable pageable
    ){
        return service.findByTitle(title,pageable);
    }

    @GetMapping("/sorted")
    public List<Book> findAllSorterd(){
        return service.findAllSortedByName();
    }

    @GetMapping("/search/author")
    public Page<Book> searchByAuthor(
            @RequestParam String author,
            Pageable pageable
    ) {
        return service.findByAuthor(author,pageable);
    }
}
