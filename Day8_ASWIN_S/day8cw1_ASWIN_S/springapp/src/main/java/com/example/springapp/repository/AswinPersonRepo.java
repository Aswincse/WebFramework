package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AswinPerson;
import java.util.List;


@Repository
public interface AswinPersonRepo extends JpaRepository<AswinPerson,Integer>{

    List<AswinPerson> findByNameStartingWith(String name);
    List<AswinPerson> findByNameEndingWith(String name);
    
}
