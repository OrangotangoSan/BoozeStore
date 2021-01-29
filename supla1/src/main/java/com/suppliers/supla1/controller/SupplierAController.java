package com.suppliers.supla1.controller;


import com.suppliers.supla1.model.dto.OrderRequestA;
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
    public List<OrderRequestA> ordersList(){
        return supplierARepository.findAll();
    }

    @PostMapping("/request")
    public OrderRequestA receiveRequest(@RequestBody OrderRequestA request ){
        return supplierARepository.save(request);
    }
}
