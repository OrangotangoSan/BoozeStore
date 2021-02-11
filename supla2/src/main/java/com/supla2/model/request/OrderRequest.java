package com.supla2.model.request;

import lombok.Data;

@Data
public class OrderRequest {

    private String productCode;
    private int quantity;
}
