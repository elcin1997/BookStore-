package com.example.bookstore.mapper;

import com.example.bookstore.domain.Authorr;
import com.example.bookstore.dto.requset.AuthorRequest;
import com.example.bookstore.dto.response.AuthorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorrMapper {
    AuthorrMapper INSTANCE = Mappers.getMapper(AuthorrMapper.class);

    Authorr authorrRqeusetToAuthorr(AuthorRequest authorRequest);

    AuthorResponse authorToAuthorrResponse(Authorr authorr);

}
