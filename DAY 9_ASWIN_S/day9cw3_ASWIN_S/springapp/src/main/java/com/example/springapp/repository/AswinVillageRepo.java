package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AswinVillage;
import java.util.List;

@Repository
public interface AswinVillageRepo extends JpaRepository<AswinVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    AswinVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    AswinVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<AswinVillage> findByPopulation(int population);

}
