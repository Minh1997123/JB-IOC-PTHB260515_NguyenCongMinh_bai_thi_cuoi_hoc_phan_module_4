package com.example.courseservice.service;

import com.example.courseservice.entity.CoursesEntity;
import com.example.courseservice.repository.ICourserepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private ICourserepository courserepository;

    public CourseService(ICourserepository courserepository) {
        this.courserepository = courserepository;
    }

    public CoursesEntity getCourseById(Long id) {
        return courserepository.getById(id);
    }

    public String updateCourse(Long courseId) {
        CoursesEntity coursesEntity = courserepository.getReferenceById(courseId);
        coursesEntity.setCapacity(coursesEntity.getCapacity()-1);
        courserepository.save(coursesEntity);
        return "success";
    }
}
