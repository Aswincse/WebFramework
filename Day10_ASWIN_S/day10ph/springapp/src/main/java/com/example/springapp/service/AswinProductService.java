package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AswinProduct;
import com.example.springapp.repository.AswinProductRepo;

@Service
public class AswinProductService {
    @Autowired
    private AswinProductRepo productRepo;

    public boolean saveProduct(AswinProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<AswinProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public AswinProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public AswinProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}