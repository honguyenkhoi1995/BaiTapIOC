package com.example.demo.controller;

import com.example.demo.component.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final Student student;

    public StudentController(Student student) {
        this.student = student;
    }

    @GetMapping("/student")
    public String getStudent() {
        return student.getName();
    }
}
