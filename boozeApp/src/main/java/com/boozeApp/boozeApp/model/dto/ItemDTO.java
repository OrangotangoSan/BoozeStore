package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "items")
public class ItemDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private OrderDTO order;

    @OneToOne
    private ProductDTO Product;

    private int quantity;
}
