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
    private String nome;
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name ="productCod", strategy = "uuid2")
    @Column( unique = true)
    private String productCod;

}
