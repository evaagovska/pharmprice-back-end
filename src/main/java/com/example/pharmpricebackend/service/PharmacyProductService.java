package com.example.pharmpricebackend.service;

import com.example.pharmpricebackend.model.PharmacyProduct;

import java.util.List;

public interface PharmacyProductService {
    List<PharmacyProduct> searchByName(String name);
}
