package com.example.studentservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CoursesDTO {
    private Long id;
    private String courses_name;
    private Integer capacity;
    private Integer credit;
}
