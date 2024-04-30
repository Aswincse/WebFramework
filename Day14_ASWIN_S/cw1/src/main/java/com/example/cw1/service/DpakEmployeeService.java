package com.example.cw1.service;

import com.example.cw1.model.AswinEmployee;
import com.example.cw1.repository.AswinEmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AswinEmployeeService {
    private final AswinEmployeeRepo employeeRepo;

    public AswinEmployeeService(AswinEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public AswinEmployee createEmployee(AswinEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<AswinEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<AswinEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
