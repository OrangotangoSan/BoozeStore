package com.supla1.model.request;

import com.supla1.model.dto.ItemProduct;
import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {

    private String OrderCod;
    private String productCod;
    private int quantity;


}
