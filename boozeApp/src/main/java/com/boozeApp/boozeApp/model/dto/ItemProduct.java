package com.boozeApp.boozeApp.model.dto;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Entity
public class ItemProduct {

    @Id
    private Long id;
    @ManyToOne
    //missing join column name product_id --- Parei aki
    private Product product;

    //missing order
    private BigDecimal totalCost;
    private int quantity;
}
