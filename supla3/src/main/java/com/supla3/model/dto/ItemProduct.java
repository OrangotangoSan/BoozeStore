package com.supla3.model.dto;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "supc_products")
public class ItemProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String productCod;

    private int units;
}
