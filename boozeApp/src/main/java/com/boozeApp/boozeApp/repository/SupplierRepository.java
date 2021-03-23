package com.boozeApp.boozeApp.repository;

import com.boozeApp.boozeApp.model.dto.SupplierDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierDTO, Long> {
}
