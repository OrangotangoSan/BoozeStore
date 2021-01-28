package com.supla2.supla2.controller;


import com.supla2.supla2.model.ProductOrderRequestB;
import com.supla2.supla2.repository.SupplierBrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplierb")
public class SupplierBcontroller {

    @Autowired
    private SupplierBrepository supplierBrepository;


    @GetMapping
    public List<ProductOrderRequestB> ordersList(){
        return supplierBrepository.findAll();
    }

    @PostMapping
    public ProductOrderRequestB receiveRequest(@RequestBody ProductOrderRequestB request){
        return supplierBrepository.save(request);
    }
}
