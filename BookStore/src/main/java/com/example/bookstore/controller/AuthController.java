package com.example.bookstore.controller;

import com.example.bookstore.domain.User;
import com.example.bookstore.dto.requset.LoginRequest;
import com.example.bookstore.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {


    private final UserService userService;



    @PostMapping("/register")
    public  String register(@RequestBody User user) {

        return "jwt";
    }


    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return "login";
    }


}

 */
