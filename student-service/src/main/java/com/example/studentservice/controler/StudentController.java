package com.example.studentservice.controler;

import com.example.studentservice.DTO.CoursesDTO;
import com.example.studentservice.DTO.StudentDTO;
import com.example.studentservice.OpenFeign.CourseClient;
import com.example.studentservice.service.StudentService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("students/enroll")
    public HttpEntity<String> registerCourses(@RequestBody StudentDTO studentDTO) {
        return  ResponseEntity.ok(studentService.createStudent(studentDTO));
    }
}
