package com.example.bookstore.dto.requset;

import com.example.bookstore.domain.Authorr;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {
    private  String name;
    private Authorr authorr;

}
