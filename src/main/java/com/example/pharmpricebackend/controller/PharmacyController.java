package com.example.pharmpricebackend.controller;

import com.example.pharmpricebackend.model.Pharmacy;
import com.example.pharmpricebackend.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pharmacies")
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

    @GetMapping("/search")
    public ResponseEntity<List<Pharmacy>> searchPharmaciesByName(@RequestParam String name) {
        List<Pharmacy> pharmacies = pharmacyService.searchByName(name);
        if (pharmacies.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pharmacies);
    }
}
