package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.AswinStudent;
import com.example.springapp.service.AswinStudentService;

@RestController
public class AswinStudentController {
    @Autowired
    private AswinStudentService studentService;

    @PostMapping("/api/student")
    public ResponseEntity<AswinStudent> post(@RequestBody AswinStudent student) {
        if (studentService.post(student)) {
            return new ResponseEntity<>(student, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/student/markGreaterThan/{marks}")
    public ResponseEntity<List<AswinStudent>> getGreater(@PathVariable int marks) {
        List<AswinStudent> list = studentService.getGreater(marks);
        if (list.size() > 0) {
            return new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/student/markLessThan/{marks}")
    public ResponseEntity<List<AswinStudent>> getLesser(@PathVariable int marks) {
        List<AswinStudent> list = studentService.getLesser(marks);
        if (list.size() > 0) {
            return new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
