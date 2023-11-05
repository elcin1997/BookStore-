package com.example.bookstore.controller;

import com.example.bookstore.dto.requset.AuthorRequest;
import com.example.bookstore.dto.response.AuthorResponse;
import com.example.bookstore.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private  final AuthorService authorService;

    @PostMapping
    public AuthorResponse create(@RequestBody AuthorRequest authorRequest){
        return authorService.create(authorRequest);
    }
}
