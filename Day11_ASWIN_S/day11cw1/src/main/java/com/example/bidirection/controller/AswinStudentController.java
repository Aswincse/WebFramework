package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.AswinStudent;
import com.example.bidirection.model.AswinStudentInfo;
import com.example.bidirection.service.AswinStudentService;
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
    @PostMapping("/api/poststudent")
    public AswinStudent postMethodName(@RequestBody AswinStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AswinStudentInfo postMethodName(@RequestBody AswinStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AswinStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}