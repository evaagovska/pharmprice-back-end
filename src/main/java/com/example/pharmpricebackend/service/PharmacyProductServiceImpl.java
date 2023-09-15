package com.example.pharmpricebackend.service;

import com.example.pharmpricebackend.model.PharmacyProduct;
import com.example.pharmpricebackend.repository.PharmacyProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyProductServiceImpl implements PharmacyProductService {

    @Autowired
    private PharmacyProductRepository pharmacyProductRepository;

    @Override
    public List<PharmacyProduct> searchByName(String name) {
        return pharmacyProductRepository.findByNameContainingIgnoreCase(name);
    }

    // Other service method implementations can be added here
}
