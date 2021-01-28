package com.supla3.supla3.controller;


import com.supla3.supla3.model.ProductOrderRequestC;
import com.supla3.supla3.repository.SupplierCrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplierc")
public class SupplierCcontroller {


    @Autowired
    private SupplierCrepository supplierCrepository;


    @GetMapping
    public List<ProductOrderRequestC> ordersListB(){
        return supplierCrepository.findAll();
    }

    @PostMapping("/request")
    public ProductOrderRequestC receiveRequestC(@RequestBody ProductOrderRequestC request){
        return supplierCrepository.save(request);
    }
}
