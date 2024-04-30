package com.example.cw1.controller;

import com.example.cw1.model.AswinEmployee;
import com.example.cw1.service.AswinEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class AswinEmployeeController {
    private final AswinEmployeeService employeeService;

    public AswinEmployeeController(AswinEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<AswinEmployee> createEmployee(@RequestBody AswinEmployee employee) {
        AswinEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<AswinEmployee>> getAllEmployees() {
        List<AswinEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<AswinEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<AswinEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

