package com.example.bookstore.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "studets")
@Data@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;
    private Integer age;
    /*
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinTable(name = "id-users",
    joinColumns = {@JoinColumn(name = "student_i",referencedColumnName = "id")},
    inverseJoinColumns =
            {@JoinColumn(name = "user_id",referencedColumnName = "id")})
    private  User user;

     */



}
