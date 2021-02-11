package com.supla3.model.request;

import lombok.Data;


@Data
public class OrderRequest {


    private String productCod;

    public String getProductCod() {
        return productCod;
    }

    public void setProductCod(String productCod) {
        this.productCod = productCod;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;
}
