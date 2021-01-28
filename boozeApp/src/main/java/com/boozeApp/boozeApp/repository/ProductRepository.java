package com.boozeApp.boozeApp.repository;

import com.boozeApp.boozeApp.model.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
