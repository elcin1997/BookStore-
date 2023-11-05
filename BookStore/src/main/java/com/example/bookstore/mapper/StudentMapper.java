package com.example.bookstore.mapper;

import com.example.bookstore.domain.Student;
import com.example.bookstore.dto.requset.StudetReqeuest;
import com.example.bookstore.dto.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    Student studentRequestToStudent(StudetReqeuest studetReqeuest);

    StudentResponse studentToStudentResponse(Student student);

}
