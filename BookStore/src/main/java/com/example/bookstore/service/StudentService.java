package com.example.bookstore.service;

import com.example.bookstore.dto.requset.StudetReqeuest;
import com.example.bookstore.dto.response.StudentResponse;
import com.example.bookstore.mapper.StudentMapper;
import com.example.bookstore.repository.StudentRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRespository studentRespository;
    StudentMapper mapper =StudentMapper.INSTANCE;

    public StudentResponse cerate(StudetReqeuest studetReqeuest) {
        var entity = mapper.studentRequestToStudent(studetReqeuest);
        var student = studentRespository.save(entity);
        return mapper.studentToStudentResponse(student);
    }
}
