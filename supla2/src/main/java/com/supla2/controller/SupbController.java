package com.supla2.controller;

import com.supla2.businessRules.SupplierBManagementProcessor;
import com.supla2.model.request.OrderRequest;
import com.supla2.model.response.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplierb")
public class SupbController {


    @Autowired
    private SupplierBManagementProcessor supplierBManagementProcessor;


    @PostMapping("/order")
    public OrderResponse receiveRequestB(@RequestBody OrderRequest request) {
        return supplierBManagementProcessor.processOrderRequest(request);

    }


}

