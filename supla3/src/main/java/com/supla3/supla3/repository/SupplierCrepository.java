package com.supla3.supla3.repository;


import com.supla3.supla3.model.ProductOrderRequestC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierCrepository extends JpaRepository<ProductOrderRequestC, Long> {
}
