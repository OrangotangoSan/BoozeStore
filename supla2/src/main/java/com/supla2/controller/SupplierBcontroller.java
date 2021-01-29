package com.supla2.controller;


import com.supla2.repository.SupplierBrepository;
import com.supla2.model.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplierb")
public class SupplierBcontroller {

    @Autowired
    private SupplierBrepository supplierBrepository;


    @GetMapping
    public List<OrderRequest> ordersList(){
        return supplierBrepository.findAll();
    }

    @PostMapping
    public OrderRequest receiveRequest(@RequestBody OrderRequest request){
        return supplierBrepository.save(request);
    }
}
