package com.boozeApp.boozeApp.repository;

import com.boozeApp.boozeApp.model.dto.ItemDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemDTO, Long> {
}
