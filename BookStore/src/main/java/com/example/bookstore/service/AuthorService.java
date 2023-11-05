package com.example.bookstore.service;

import com.example.bookstore.dto.requset.AuthorRequest;
import com.example.bookstore.dto.response.AuthorResponse;
import com.example.bookstore.mapper.AuthorrMapper;
import com.example.bookstore.repository.AuthorrRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private  final AuthorrRepository authorrRepository;
    AuthorrMapper mapper =AuthorrMapper.INSTANCE;

    public AuthorResponse create (AuthorRequest authorRequest) {
        var entity= mapper.authorrRqeusetToAuthorr(authorRequest);
        var author=authorrRepository.save(entity);
        return mapper.authorToAuthorrResponse(author);
    }

}
