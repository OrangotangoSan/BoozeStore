package com.supla3.controller;


import com.supla3.repository.SupplierCrepository;
import com.supla3.model.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplierc")
public class SupplierCcontroller {


    @Autowired
    private SupplierCrepository supplierCrepository;


    @GetMapping
    public List<OrderRequest> ordersListC(){
        return supplierCrepository.findAll();
    }

    @PostMapping("/request")
    public OrderRequest receiveRequestC(@RequestBody OrderRequest request){
        return supplierCrepository.save(request);
    }
}
