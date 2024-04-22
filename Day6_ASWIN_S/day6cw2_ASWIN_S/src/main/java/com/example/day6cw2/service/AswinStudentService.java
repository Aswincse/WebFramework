package com.example.day6cw2.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw2.model.AswinStudent;
import com.example.day6cw2.repository.AswinStudentRepo;

@Service
public class AswinStudentService {
    public AswinStudentRepo studentRepo;
    public AswinStudentService(AswinStudentRepo studentRepo)
    {
        this.studentRepo = studentRepo;
    }
    public boolean postStudent(AswinStudent student)
    {
        try{

            studentRepo.save(student);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AswinStudent> paginationStudents(int pageno,int size)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<AswinStudent>  sortPaginationStudents(int pageno,int size,String field)
    {
        return studentRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
