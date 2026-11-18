package com.example.studentservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@EnableFeignClients
@Data
public class StudentDTO {
    private Long studentId;
    private Long courseId;
}
