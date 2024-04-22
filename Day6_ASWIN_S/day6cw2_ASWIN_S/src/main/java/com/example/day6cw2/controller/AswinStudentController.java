package com.example.day6cw2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6cw2.model.AswinStudent;
import com.example.day6cw2.service.AswinStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class AswinStudentController {
    public AswinStudentService studentService;
    public AswinStudentController(AswinStudentService studentService)
    {
        this.studentService = studentService;
    }

    @PostMapping("/api/student")
    public ResponseEntity<AswinStudent> postMethodName(@RequestBody AswinStudent student) {
        if(studentService.postStudent(student))
        {
            return new ResponseEntity<>(student,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/student")
    public ResponseEntity<List<AswinStudent>> getMethodName(@RequestParam("pageNo") int pageno , @RequestParam("pageSize") int size) {
        List<AswinStudent> list = studentService.paginationStudents(pageno,size);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    
    @GetMapping("/api/student/sort")
    public ResponseEntity<List<AswinStudent>> getsortPagination(@RequestParam("pageNo") int pageno , @RequestParam("pageSize") int size,@RequestParam("sortBy") String field) {
        List<AswinStudent> list = studentService.sortPaginationStudents(pageno, size, field);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }


    
}
