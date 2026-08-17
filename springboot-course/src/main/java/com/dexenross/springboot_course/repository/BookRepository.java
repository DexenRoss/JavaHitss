package com.dexenross.springboot_course.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dexenross.springboot_course.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

    boolean existsByIsbn(String isbn);

    List<Book> findByTitle(String title);

}
