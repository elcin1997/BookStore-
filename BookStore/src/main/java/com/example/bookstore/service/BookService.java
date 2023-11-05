package com.example.bookstore.service;

import com.example.bookstore.domain.Book;
import com.example.bookstore.dto.requset.BookRequest;
import com.example.bookstore.dto.response.BookResponse;
import com.example.bookstore.mapper.BookMapper;
import com.example.bookstore.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookService {

    private  final BookRepository bookRepository;

    BookMapper mapper =BookMapper.INSTANCE;

    public BookResponse create (BookRequest bookRequest){
        var entity =mapper.bookRequestToBook(bookRequest);
        var books=bookRepository.save(entity);
        return mapper.bookToBookResponse(books);
    }

    public List<Book> findAll(){
        return bookRepository.findAll();
    }









}
