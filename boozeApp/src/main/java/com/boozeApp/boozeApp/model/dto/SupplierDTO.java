package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "suppliers")
public class SupplierDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "supplier")
    private List<ProductDTO> product;

    private String name;

    @NotBlank
    private String baseUrl;
}
