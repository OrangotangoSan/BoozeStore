package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders")
public class OrderDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "order_product")
    private Long orderID;

    //todo colocar order code auto gerado - precisa ser unico!
    @Column(name = "order_code")
    private String orderCode;


    @Column(name = "client_name")
    private String clientName;
}
