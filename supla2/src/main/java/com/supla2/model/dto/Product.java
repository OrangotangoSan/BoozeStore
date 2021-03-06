package com.supla2.model.dto;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data

@Entity
@Table(name = "supb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private BigDecimal price;

    @Column(name = "product_code")
    private String productCode;

    private int quantity;
}
