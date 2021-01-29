package com.supla1.controller;


import com.supla1.repository.SupplierARepository;
import com.supla1.model.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliera")
public class SupplierAController {




    @Autowired
    private SupplierARepository supplierARepository;



    @GetMapping
    public List<OrderRequest> ordersList(){
        return supplierARepository.findAll();
    }

    @PostMapping("/request")
    public OrderRequest receiveRequest(@RequestBody OrderRequest request ){
        return supplierARepository.save(request);
    }
}
