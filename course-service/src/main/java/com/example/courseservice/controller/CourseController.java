package com.example.courseservice.controller;

import com.example.courseservice.entity.CoursesEntity;
import com.example.courseservice.service.CourseService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/")
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses/{courseId}")
    public HttpEntity<CoursesEntity> getInfo(@PathVariable("courseId") Long courseId){
        return ResponseEntity.ok(courseService.getCourseById(courseId));
    }

    @PostMapping("courses/{courseId}")
    public HttpEntity<String> updateCourses(@PathVariable("courseId")Long courseId ){
        return  ResponseEntity.ok(courseService.updateCourse(courseId));
    }
}
