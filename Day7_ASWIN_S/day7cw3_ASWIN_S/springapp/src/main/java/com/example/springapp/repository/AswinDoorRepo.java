package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AswinDoor;
import java.util.List;

@Repository
public interface AswinDoorRepo extends JpaRepository<AswinDoor,Integer>{

    List<AswinDoor> findByDoorId(int doorId);
    List<AswinDoor> findByAccessType(String accessType);
    
}
