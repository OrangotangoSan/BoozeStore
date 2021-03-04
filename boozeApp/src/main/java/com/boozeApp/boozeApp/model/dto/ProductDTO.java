package com.boozeApp.boozeApp.model.dto;

import lombok.Data;
import org.springframework.boot.context.properties.bind.Name;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "products")
public class ProductDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    //COLOCAR RELAÇÃO
    @Column(name = "supplier_id")
    private Long supplierId;
    //COLOCAR RELAÇÃO
    @Column(name = "product_code")
    private String productCode;
    private String name;
    private BigDecimal price;
    private int quantity;

}
