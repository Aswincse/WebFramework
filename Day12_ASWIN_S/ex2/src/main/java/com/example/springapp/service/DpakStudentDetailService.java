package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinStudentDetail;
import com.example.springapp.repository.AswinStudentDetailRepository;
import com.example.springapp.repository.AswinStudentRepository;

@Service
public class AswinStudentDetailService {
    @Autowired
    AswinStudentDetailRepository studentDetailRepository;
    @Autowired
    AswinStudentRepository studentRepository;
    public AswinStudentDetail addStudentDetail(int id,AswinStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
