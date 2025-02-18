package com.example.controller;

import com.example.model.Purchase;
import com.example.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        purchaseRepository.storePurchase(purchase);
        System.out.println("post");
    }

    @GetMapping
    public List<Purchase> findPurchase(){
        System.out.println("get");
        return purchaseRepository.findAllPurchases();
    }

    @GetMapping("/hi")
    public String view(){
        return "hello";
    }
}
