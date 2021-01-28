package com.boozeApp.boozeApp.model.dto;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Entity
public class ItemProduct {

    @Id
    private Long id;
    private BigDecimal totalCost;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
}
