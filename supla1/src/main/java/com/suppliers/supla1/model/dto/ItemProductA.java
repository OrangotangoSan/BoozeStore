package com.suppliers.supla1.model.dto;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Data
@Entity
@Table(name = "supa_product")
public class ItemProductA {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String productCod;

}
