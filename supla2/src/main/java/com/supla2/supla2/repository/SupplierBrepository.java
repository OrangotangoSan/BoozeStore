package com.supla2.supla2.repository;

import com.supla2.supla2.model.dto.OrderRequestB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierBrepository extends JpaRepository<OrderRequestB, Long> {
}
