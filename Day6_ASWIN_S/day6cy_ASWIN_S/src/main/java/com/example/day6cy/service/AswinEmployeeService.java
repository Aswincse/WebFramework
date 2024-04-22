package com.example.day6cy.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cy.model.AswinEmployee;
import com.example.day6cy.repository.AswinEmployeeRepo;

@Service
public class AswinEmployeeService {
    public AswinEmployeeRepo employeeRepo;
    public AswinEmployeeService(AswinEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean postEmployee(AswinEmployee employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AswinEmployee> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<AswinEmployee> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<AswinEmployee>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
