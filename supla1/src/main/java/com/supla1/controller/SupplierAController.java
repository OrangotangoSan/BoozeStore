package com.supla1.controller;


import com.supla1.businessRules.SupplierAManagementProcessor;
import com.supla1.model.response.OrderResponse;
import com.supla1.repository.ProductRepositoryA;
import com.supla1.model.request.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliera")
public class SupplierAController {




    @Autowired
    private SupplierAManagementProcessor supplierAManagementProcessor;






    @PostMapping("/order")
    public OrderResponse receiveRequestA(@RequestBody OrderRequest request ){
        return supplierAManagementProcessor.processOrderRequest(request);

    }
}
