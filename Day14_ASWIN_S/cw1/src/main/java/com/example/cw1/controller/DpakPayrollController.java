package com.example.cw1.controller;

import com.example.cw1.model.AswinPayroll;
import com.example.cw1.service.AswinPayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/{employeeId}/payroll")
public class AswinPayrollController {
    private final AswinPayrollService payrollService;

    public AswinPayrollController(AswinPayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public ResponseEntity<AswinPayroll> createPayrollForEmployee(@PathVariable Long employeeId, @RequestBody AswinPayroll payroll) {
        AswinPayroll createdPayroll = payrollService.createPayroll(payroll);
        if (createdPayroll != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPayroll);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping
    public ResponseEntity<AswinPayroll> getPayrollForEmployee(@PathVariable Long employeeId) {
        AswinPayroll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return ResponseEntity.ok(payroll);
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
