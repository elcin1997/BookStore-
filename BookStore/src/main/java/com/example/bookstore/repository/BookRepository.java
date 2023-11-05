package com.example.bookstore.repository;

import com.example.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findByAuthorr_Id(Long aLong);
}
