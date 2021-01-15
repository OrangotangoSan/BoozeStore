package com.boozestore.boozeApp.Controller;


import com.boozestore.boozeApp.Model.Product;
import com.boozestore.boozeApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/list")
    public List<Product> listProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/search/{id}")
    public Object searchProduct(@PathVariable("id") Long id){   //funfa
        return productRepository.findById(id);
    }

    /*
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable("id") Long id ){   //nao funfa

        Product selectedProduct = productRepository.getOne(id);

        productRepository.delete(selectedProduct);
    }

    @PutMapping("/edit")
    public Product editProduct(@RequestBody Product product){  //ta fazendo o msm q o put...
        return productRepository.save(product);
    }


     */
}
