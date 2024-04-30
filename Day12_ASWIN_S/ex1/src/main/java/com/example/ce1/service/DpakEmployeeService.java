package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.AswinEmployee;
import com.example.ce1.repository.AswinEmployeeRepo;

@Service
public class AswinEmployeeService {
    @Autowired
    AswinEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public AswinEmployee setEmployee(AswinEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AswinEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AswinEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
