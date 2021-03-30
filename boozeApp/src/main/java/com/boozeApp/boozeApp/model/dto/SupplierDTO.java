package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "suppliers")
public class SupplierDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String baseUrl;



    @OneToMany(mappedBy = "supplier")
    private List<ProductDTO> product;

}
