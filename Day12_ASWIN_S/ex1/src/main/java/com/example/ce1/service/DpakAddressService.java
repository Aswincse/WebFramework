package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.AswinAddress;
import com.example.ce1.repository.AswinAddressRepo;
import com.example.ce1.repository.AswinEmployeeRepo;

@Service
public class AswinAddressService {
    @Autowired
    AswinAddressRepo addressRepo;
    @Autowired
    AswinEmployeeRepo employeeRepo;
    public AswinAddress setAddressById(int id,AswinAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
