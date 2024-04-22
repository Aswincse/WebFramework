package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinPerson;
import com.example.springapp.repository.AswinPersonRepo;

@Service
public class AswinPersonService {
    @Autowired
    private AswinPersonRepo rep;

    public boolean post(AswinPerson person)
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

    public List<AswinPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<AswinPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
