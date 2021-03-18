package com.boozeApp.boozeApp.repository;

import com.boozeApp.boozeApp.model.dto.OrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDTO, Long> {

}
