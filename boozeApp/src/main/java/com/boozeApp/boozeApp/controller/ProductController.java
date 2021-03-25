package com.boozeApp.boozeApp.controller;

import com.boozeApp.boozeApp.model.dto.ProductDTO;
import com.boozeApp.boozeApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add")
    public ProductDTO addProduct(@RequestBody ProductDTO product){

        return productRepository.save(product);
    }
}
