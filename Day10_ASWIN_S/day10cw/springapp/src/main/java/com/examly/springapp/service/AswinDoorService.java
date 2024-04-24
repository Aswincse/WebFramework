package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.AswinDoor;
import com.examly.springapp.repository.AswinDoorRepo;

@Service
public class AswinDoorService {
    @Autowired
    private AswinDoorRepo doorRepo;

    public AswinDoor postData(AswinDoor door) {
        return doorRepo.save(door);
    }

    public List<AswinDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public AswinDoor updateDetail(int doorid, AswinDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<AswinDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<AswinDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public AswinDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}