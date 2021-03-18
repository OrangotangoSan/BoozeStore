package com.boozeApp.boozeApp.model.request;

import com.boozeApp.boozeApp.model.Order;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class OrderRequest {

    @Length(min = 3,message = "Client name must have at least 3 characters!")
    @NotBlank(message ="Client Name must not be blank!")
    private String clientName;
    @NotNull(message = "there must be an order!")
    private Order order;



}
