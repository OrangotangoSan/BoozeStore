package com.supla2.repository;

import com.supla2.model.dto.Product;
import com.supla2.model.request.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findProductCode(String productCode);
}
