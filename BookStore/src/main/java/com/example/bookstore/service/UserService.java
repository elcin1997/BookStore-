package com.example.bookstore.service;

import com.example.bookstore.domain.User;
import com.example.bookstore.repository.UserRepository;
import com.example.bookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Service;

//import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {


    private  final UserRepository userRepository;

   /*

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user=userRepository.findByUsername(username)
                .orElseThrow(()-> new RuntimeException("User not found"));
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                user.getRoles()
                        .stream()
                        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
                        .collect(Collectors.toSet())
        );
    }

    */


}


