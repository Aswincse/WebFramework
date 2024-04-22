package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinDoor;
import com.example.springapp.repository.AswinDoorRepo;

@Service
public class AswinDoorService {
    @Autowired
    private AswinDoorRepo rep;

    public boolean post(AswinDoor door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AswinDoor> getAll()
    {
        return rep.findAll();
    }

    public List<AswinDoor> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<AswinDoor> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
