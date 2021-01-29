package com.supla3.supla3.controller;


import com.supla3.supla3.model.dto.OrderRequestC;
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
    public List<OrderRequestC> ordersListB(){
        return supplierCrepository.findAll();
    }

    @PostMapping("/request")
    public OrderRequestC receiveRequestC(@RequestBody OrderRequestC request){
        return supplierCrepository.save(request);
    }
}
