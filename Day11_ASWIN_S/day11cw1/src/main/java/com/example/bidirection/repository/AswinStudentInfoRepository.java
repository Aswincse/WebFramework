package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.AswinStudentInfo;

@Repository
public interface AswinStudentInfoRepository extends JpaRepository<AswinStudentInfo,Integer>{
    
}