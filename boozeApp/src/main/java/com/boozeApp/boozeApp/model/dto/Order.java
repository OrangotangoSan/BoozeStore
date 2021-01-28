package com.boozeApp.boozeApp.model.dto;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderNumber;

    @OneToMany
    private List<ItemProduct> itemProductList;

    private Date requestedDate;

    private Client client;
}
