package com.example.bookstore.dto.response;

import com.example.bookstore.domain.Authorr;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private Long id;
    private String name;
    private Authorr authorr;
}
