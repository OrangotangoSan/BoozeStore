package com.supla2.controller;


import com.supla2.businessLogic.SupplierBmanagementProcessor;
import com.supla2.model.response.OrderResponse;
import com.supla2.repository.ProductRepository;
import com.supla2.model.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplierb")
public class SupplierBcontroller {

    @Autowired
    private SupplierBmanagementProcessor supplierBmanagementProcessor;



    @PostMapping("/order")
    public OrderResponse  processOrderRequest(@RequestBody OrderRequest request){
        return supplierBmanagementProcessor.processOrderRequest(request);
    }
}
