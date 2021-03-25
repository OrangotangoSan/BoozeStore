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

    private String name;

    private String productCode;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn
    private SupplierDTO supplier;

}
