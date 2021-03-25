package com.boozeApp.boozeApp.controller;


import com.boozeApp.boozeApp.businessRules.OrderManagementProcessor;
import com.boozeApp.boozeApp.model.request.OrderRequest;
import com.boozeApp.boozeApp.model.response.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderManagementProcessor orderManagementProcessor;


    @PostMapping("/add")
    public OrderResponse receiveNewOrder(@RequestBody @Valid OrderRequest or){
        return orderManagementProcessor.processOrderRequest(or);
    }

}
