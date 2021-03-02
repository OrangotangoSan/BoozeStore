package com.supla1.repository;

import com.supla1.model.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepositoryA extends JpaRepository<Product, Long> {

    Product findProductByProductCode(String productCode);
}
