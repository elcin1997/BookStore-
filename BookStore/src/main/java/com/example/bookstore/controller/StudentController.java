package com.example.bookstore.controller;

import com.example.bookstore.dto.requset.StudetReqeuest;
import com.example.bookstore.dto.response.StudentResponse;
import com.example.bookstore.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private  final StudentService studentService ;

    @PostMapping
    public StudentResponse cerate(@RequestBody StudetReqeuest studetReqeuest){

        return studentService.cerate(studetReqeuest);
    }
}
