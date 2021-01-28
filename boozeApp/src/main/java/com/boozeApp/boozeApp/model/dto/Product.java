package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String description;
    private String image;

    @OneToMany(fetch = FetchType.LAZY)
    private List<ItemProduct> itemProductList;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

}
