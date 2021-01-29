package com.supla3.repository;


import com.supla3.model.request.OrderRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierCrepository extends JpaRepository<OrderRequest, Long> {
}
