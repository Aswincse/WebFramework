package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.AswinEmployee;
import com.example.ce1.service.AswinEmployeeService;

@RestController
public class AswinEmployeeController {
    @Autowired
    AswinEmployeeService employeeService;

    @PostMapping("/employee")
    public AswinEmployee setMethod(@RequestBody AswinEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AswinEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AswinEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
