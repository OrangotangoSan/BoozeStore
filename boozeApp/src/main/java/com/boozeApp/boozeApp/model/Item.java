package com.boozeApp.boozeApp.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class Item {

    @NotBlank(message = "Type the product code!")
    private String productCode;

    @Min(1)
    private int quantity;
}
