package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "suppliers")
public class SupplierDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    @OneToMany(mappedBy = "products")
    private Long supplierId;
    @Column(name = "supplier_code")
    private String supplierCode;
    private String name;
    private String email;
    @Column(name = "orders_uri")
    private String ordersURI;
}
