package com.example.studentservice.OpenFeign;

import com.example.studentservice.DTO.CoursesDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "course-service")
public interface CourseClient {
    @GetMapping("/api/courses/{courseId}")
    public CoursesDTO getCourse(@PathVariable("courseId") Long courseId);

    @PostMapping("/api/courses/{courseId}")
    public  String updateCourse(@PathVariable("courseId") Long courseId);
}
