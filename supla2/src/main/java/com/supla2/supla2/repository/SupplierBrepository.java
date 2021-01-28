package com.supla2.supla2.repository;

import com.supla2.supla2.model.ProductOrderRequestB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierBrepository extends JpaRepository<ProductOrderRequestB, Long> {
}
