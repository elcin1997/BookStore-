package com.example.bookstore.controller;

import com.example.bookstore.domain.Book;
import com.example.bookstore.dto.requset.BookRequest;
import com.example.bookstore.dto.response.BookResponse;
import com.example.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookKontroller {

    private final BookService bookService;
    @PostMapping
    public BookResponse create(@RequestBody BookRequest bookRequest){
        return  bookService.create(bookRequest);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.findAll();
    }

}
