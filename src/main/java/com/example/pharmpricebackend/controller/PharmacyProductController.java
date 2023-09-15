package com.example.pharmpricebackend.controller;

import com.example.pharmpricebackend.model.PharmacyProduct;
import com.example.pharmpricebackend.service.PharmacyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pharmacyProducts")
public class PharmacyProductController {
    @Autowired
    private PharmacyProductService pharmacyProductService;

    @GetMapping("/search")
    public ResponseEntity<List<PharmacyProduct>> searchPharmacyProductsByName(@RequestParam String name) {
        List<PharmacyProduct> pharmacyProducts = pharmacyProductService.searchByName(name);
        if (pharmacyProducts.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(pharmacyProducts);
    }
}