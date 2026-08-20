package com.dexenross.springboot_course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dexenross.springboot_course.model.Book;
import com.dexenross.springboot_course.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository r){
        repository = r;
    }

    public List<Book> showAll(){
        return repository.findAll();
    }

    public Optional<Book> findById(Long id){
        return repository.findById(id);
    }

    public Book create(
        String isbn,
        String title,
        String author
    ){
        Book b = new Book(isbn, title, author);
        if (repository.existsByIsbn(isbn)) {
            throw new IllegalArgumentException(
                "Ya existe un libro con ese ISBN"
            );
        }
        return repository.save(b);
    }

    @Transactional
    public Optional<Book> update(
        Long id,
        String isbn,
        String title,
        String author
    ){
        Optional<Book> current = repository.findById(id);
        if (current.isEmpty()) {
            return Optional.empty();
        }
        Book b = current.get();
        b.update(isbn,title,author);
        Book updated = repository.save(b);
        return Optional.of(updated);
    }

    public boolean deleteById(Long id){
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);

        return true;
    }

    public Page<Book> findByTitle(String title, Pageable pageable){
        return repository.findByTitleContainingIgnoringCase(title,pageable);
    }

    public List<Book> findAllSortedByName(){
        return repository.findAll(
            Sort.by(Sort.Direction.ASC, "title")
        );
    }

    public Page<Book> findByAuthor(String author, Pageable pageable){
        return repository.findByAuthorContainingIgnoreCase(author, pageable);
    }


}
