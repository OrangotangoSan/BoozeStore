package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Supplier {

    @Id
    private Long id;
    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private List<Product> productList;
}
