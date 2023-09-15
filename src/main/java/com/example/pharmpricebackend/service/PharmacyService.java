package com.example.pharmpricebackend.service;

import com.example.pharmpricebackend.model.Pharmacy;

import java.util.List;

public interface PharmacyService {
    List<Pharmacy> searchByName(String name);
}
