package com.example.courseservice.repository;

import com.example.courseservice.entity.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourserepository extends JpaRepository<CoursesEntity, Long> {

}
