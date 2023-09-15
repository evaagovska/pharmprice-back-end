package com.example.pharmpricebackend.service;

import com.example.pharmpricebackend.model.Pharmacy;
import com.example.pharmpricebackend.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService {
    @Autowired
    private PharmacyRepository pharmacyRepository;

    @Override
    public List<Pharmacy> searchByName(String name) {
        return pharmacyRepository.findByNameContainingIgnoreCase(name);
    }
}
