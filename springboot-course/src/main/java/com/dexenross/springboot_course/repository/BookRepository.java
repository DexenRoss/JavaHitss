package com.dexenross.springboot_course.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dexenross.springboot_course.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

    boolean existsByIsbn(String isbn);

    Page<Book> findByTitleContainingIgnoringCase(String title, Pageable pageable);

    Page<Book> findByAuthorContainingIgnoreCase(String author, Pageable pageable);

}
