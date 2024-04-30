package com.example.cw1.service;

import com.example.cw1.model.AswinPayroll;
import com.example.cw1.repository.AswinPayrollRepo;
import org.springframework.stereotype.Service;

@Service
public class AswinPayrollService {
    private final AswinPayrollRepo payrollRepo;

    public AswinPayrollService(AswinPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public AswinPayroll createPayroll(AswinPayroll payroll) {
        return payrollRepo.save(payroll);
    }

    public AswinPayroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
