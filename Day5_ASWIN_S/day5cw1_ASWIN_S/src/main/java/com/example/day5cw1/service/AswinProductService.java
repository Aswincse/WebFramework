package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.AswinProduct;
import com.example.day5cw1.repository.AswinProductRepo;

@Service
public class AswinProductService {
    public AswinProductRepo productRepo;
    public AswinProductService(AswinProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(AswinProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AswinProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public AswinProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
