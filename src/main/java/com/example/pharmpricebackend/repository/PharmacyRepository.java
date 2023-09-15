package com.example.pharmpricebackend.repository;

import com.example.pharmpricebackend.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
    List<Pharmacy> findByNameContainingIgnoreCase(String name);
}
