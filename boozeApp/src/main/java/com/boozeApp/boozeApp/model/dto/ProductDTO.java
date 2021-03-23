package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "booze_products")
public class ProductDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private SupplierDTO supplier;

    //todo pegar código dos suplas
    private String productCode;

    private String name;
}
