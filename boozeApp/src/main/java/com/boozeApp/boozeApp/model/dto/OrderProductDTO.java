package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orders_products")
public class OrderProductDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_product_id")
    @OneToMany(mappedBy = "products")
    private Long orderProductId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Long productId;
    private int quantity;

}
