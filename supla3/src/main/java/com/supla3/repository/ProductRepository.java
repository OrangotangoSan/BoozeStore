package com.supla3.repository;


import com.supla3.model.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


     Product findProductByProductCode(String productCode);



}
