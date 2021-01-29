package com.supla2.supla2.controller;


import com.supla2.supla2.model.dto.OrderRequestB;
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
    public List<OrderRequestB> ordersList(){
        return supplierBrepository.findAll();
    }

    @PostMapping
    public OrderRequestB receiveRequest(@RequestBody OrderRequestB request){
        return supplierBrepository.save(request);
    }
}
