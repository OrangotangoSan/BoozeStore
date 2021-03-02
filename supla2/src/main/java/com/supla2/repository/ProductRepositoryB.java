package com.supla2.repository;

import com.supla2.model.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryB extends JpaRepository<Product, Long> {
    Product findProductByProductCode(String productCode);
}
