package com.boozeApp.boozeApp.repository;

import com.boozeApp.boozeApp.model.dto.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductDTO, Long> {

    ProductDTO findProductByProductCode(String productCode);
}
