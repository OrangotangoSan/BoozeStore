package com.supla2.model.request;

import lombok.Data;

@Data
public class OrderRequest {

    private String orderCod;
    private String productCod;
    private int quantity;
}
