package com.boozestore.boozeApp.Controller;


import com.boozestore.boozeApp.Model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;


    @GetMapping("/list")
    public List<Products> listProducts(){
        return productsRepository.findAll();
    }

    @PostMapping
    public Products addProducts(@RequestBody Products product){
        return productsRepository.save(product);
    }
}
