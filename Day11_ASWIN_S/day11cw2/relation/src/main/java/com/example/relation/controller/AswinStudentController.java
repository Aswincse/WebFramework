package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.AswinStudent;
import com.example.relation.service.AswinStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AswinStudentController {
    public AswinStudentService studentService;
    public AswinStudentController(AswinStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AswinStudent postMethodName(@RequestBody AswinStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AswinStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
