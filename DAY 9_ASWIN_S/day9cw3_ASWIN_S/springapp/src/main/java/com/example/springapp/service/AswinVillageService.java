package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinVillage;
import com.example.springapp.repository.AswinVillageRepo;

@Service
public class AswinVillageService {
    @Autowired
    private AswinVillageRepo rep;

    public boolean post(AswinVillage person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public AswinVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public AswinVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<AswinVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
