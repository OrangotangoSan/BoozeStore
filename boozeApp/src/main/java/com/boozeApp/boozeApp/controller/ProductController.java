package com.boozeApp.boozeApp.controller;


import com.boozeApp.boozeApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/list")
    public List<Product> products(){
        return productRepository.findAll();
    }

    @PostMapping
    public Product addNewProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
