package com.example.studentservice.service;

import com.example.studentservice.DTO.StudentDTO;
import com.example.studentservice.OpenFeign.CourseClient;
import com.example.studentservice.entity.StudentEntity;
import com.example.studentservice.repository.IStudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private CourseClient courseClient;
    private IStudentRepository studentRepository;

    public StudentService(CourseClient courseClient, IStudentRepository studentRepository) {
        this.courseClient = courseClient;
        this.studentRepository = studentRepository;
    }


    public String createStudent(StudentDTO studentDTO) {
        Integer capacity =  courseClient.getCourse(studentDTO.getCourseId()).getCapacity();
        if(capacity < 0 ) {
            throw new IllegalArgumentException("Capacity less than 0");
        }
//        StudentEntity studentEntity = studentRepository.getById(studentDTO.getStudentId());
//        List<Long>  courses = studentEntity.getEnrolled_courses();
//        courses.add(studentDTO.getCourseId());
//        studentEntity.setEnrolled_courses(courses);
//        studentRepository.save(studentEntity);
        courseClient.updateCourse(studentDTO.getCourseId());
        return "Success";
    }
}
