package com.example.bookstore.domain;

import com.example.bookstore.domain.enums.ERole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Enumerated(EnumType.STRING)
    private ERole name;

}
