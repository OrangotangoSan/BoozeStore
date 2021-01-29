package com.supla1.repository;

import com.supla1.model.request.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierARepository extends JpaRepository<OrderRequest, Long> {
}
