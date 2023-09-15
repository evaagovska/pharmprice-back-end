package com.example.pharmpricebackend.repository;

import com.example.pharmpricebackend.model.Pharmacy;
import com.example.pharmpricebackend.model.PharmacyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PharmacyProductRepository extends JpaRepository<PharmacyProduct, Integer> {
    List<PharmacyProduct> findByNameContainingIgnoreCase(String name);
}
