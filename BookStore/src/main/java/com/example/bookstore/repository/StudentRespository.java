package com.example.bookstore.repository;

import com.example.bookstore.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Long> {
}
