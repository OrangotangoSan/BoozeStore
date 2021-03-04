package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "orders_products")
public class OrderProductDTO {


    private Long orderProductId;
    private Long orderId;
    private Long productId;
    private int quantity;

}
