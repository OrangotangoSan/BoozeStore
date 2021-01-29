package com.supla3.supla3.repository;


import com.supla3.supla3.model.dto.OrderRequestC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierCrepository extends JpaRepository<OrderRequestC, Long> {
}
