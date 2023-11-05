package com.example.bookstore.mapper;

import com.example.bookstore.domain.Book;
import com.example.bookstore.dto.requset.BookRequest;
import com.example.bookstore.dto.response.BookResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book bookRequestToBook(BookRequest bookRequest);

    BookResponse bookToBookResponse(Book book);



}
