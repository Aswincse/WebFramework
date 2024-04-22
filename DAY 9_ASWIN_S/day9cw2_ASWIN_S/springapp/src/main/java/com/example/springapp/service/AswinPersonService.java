package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinPerson;
import com.example.springapp.repository.AswinPersonRepo;

@Service
public class AswinPersonService {
    public AswinPersonRepo personRepo;

    public AswinPersonService(AswinPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AswinPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AswinPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
