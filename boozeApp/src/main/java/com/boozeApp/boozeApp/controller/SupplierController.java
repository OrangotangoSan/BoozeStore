package com.boozeApp.boozeApp.controller;


import com.boozeApp.boozeApp.model.dto.SupplierDTO;
import com.boozeApp.boozeApp.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;



    @PostMapping("/add")
    public SupplierDTO addSupplier(@RequestBody SupplierDTO supplier){

        return supplierRepository.save(supplier);
    }


}
