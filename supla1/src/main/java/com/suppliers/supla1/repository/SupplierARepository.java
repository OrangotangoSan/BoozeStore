package com.suppliers.supla1.repository;

import com.suppliers.supla1.model.ProductOrderRequestA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierARepository extends JpaRepository<ProductOrderRequestA, Long> {
}
