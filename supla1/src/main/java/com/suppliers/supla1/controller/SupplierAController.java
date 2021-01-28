package com.suppliers.supla1.controller;


import com.suppliers.supla1.model.ProductOrderRequestA;
import com.suppliers.supla1.repository.SupplierARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliera")
public class SupplierAController {




    @Autowired
    private SupplierARepository supplierARepository;



    @GetMapping
    public List<ProductOrderRequestA> ordersList(){
        return supplierARepository.findAll();
    }

    @PostMapping("/request")
    public ProductOrderRequestA receiveRequest(@RequestBody ProductOrderRequestA request ){
        return supplierARepository.save(request);
    }
}
