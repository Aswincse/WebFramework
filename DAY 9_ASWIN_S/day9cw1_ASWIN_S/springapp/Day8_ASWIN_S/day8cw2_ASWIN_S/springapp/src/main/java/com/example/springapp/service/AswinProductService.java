package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinProduct;
import com.example.springapp.repository.AswinProductRepo;

@Service
public class AswinProductService {
    @Autowired
    private AswinProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(AswinProduct person)
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

    public List<AswinProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<AswinProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<AswinProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
