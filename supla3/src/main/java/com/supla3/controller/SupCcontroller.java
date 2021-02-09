package com.supla3.controller;


import com.supla3.businessRules.SupplierCManagementProcessor;
import com.supla3.model.request.OrderRequest;
import com.supla3.model.response.OrderResponse;
import com.supla3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplierc")
public class SupCcontroller {



    @Autowired
    private ProductRepository itemProductRepository;
    @Autowired
    private SupplierCManagementProcessor  supplierCManagementProcessor;



    //TROCAR URL
    @PostMapping("/order")
    public OrderResponse receiveRequestC(@RequestBody OrderRequest request){

        return supplierCManagementProcessor.processOrderRequest(request);
    }




}
