package com.supla3.model.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderResponse {

    private StatusOrder statusOrder=StatusOrder.KO;
    private String message;
    private BigDecimal totalAmount;
}
