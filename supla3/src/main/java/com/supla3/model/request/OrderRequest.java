package com.supla3.model.request;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class OrderRequest {

    private String orderCod;
    private String productCod;
    private int quantity;



}
