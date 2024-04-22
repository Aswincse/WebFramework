package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AswinProduct;
import java.util.List;


@Repository
public interface AswinProductRepo extends JpaRepository<AswinProduct,Integer>{

    List<AswinProduct> findByProductNameStartingWith(String name);
    List<AswinProduct> findByProductNameEndingWith(String name);
    
}
