package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.AswinStudentInfo;

@Repository
public interface AswinStudentInfoRepository extends JpaRepository<AswinStudentInfo,Integer>{
    
}