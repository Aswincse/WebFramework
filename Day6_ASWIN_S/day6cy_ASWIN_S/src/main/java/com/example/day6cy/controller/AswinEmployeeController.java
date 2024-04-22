package com.example.day6cy.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6cy.model.AswinEmployee;
import com.example.day6cy.service.AswinEmployeeService;

@RestController
public class AswinEmployeeController {
     public AswinEmployeeService employeeService;
    public AswinEmployeeController(AswinEmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @PostMapping("/api/employee")
    public ResponseEntity<AswinEmployee> postMethodName(@RequestBody AswinEmployee employee) {
        if(employeeService.postEmployee(employee))
        {
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }

   @GetMapping("/api/employee/sortBy/{field}")
    public ResponseEntity<List<AswinEmployee>> getMethodName(@PathVariable("field") String field) {
        List<AswinEmployee> list = employeeService.sortEmployee(field);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @GetMapping("/api/employee/{offset}/{pagesize}")
    public ResponseEntity<List<AswinEmployee>> getMethodName(@PathVariable("offset") int offset,@PathVariable("pagesize") int size) {
        List<AswinEmployee> list = employeeService.paginationEmployee(offset,size);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    
    @GetMapping("/api/employee/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<AswinEmployee>> getSortedPagination(@PathVariable("offset") int offset,@PathVariable("pagesize") int size,@PathVariable("field") String field) {
        List<AswinEmployee> list = employeeService.sortPaginationEmployee(offset,size,field);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
