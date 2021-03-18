package com.boozeApp.boozeApp.controller;


import com.boozeApp.boozeApp.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;


}
