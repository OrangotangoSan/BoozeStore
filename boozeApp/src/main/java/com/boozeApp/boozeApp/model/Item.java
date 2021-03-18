package com.boozeApp.boozeApp.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
public class Item {
   @NotEmpty(message = "no product code provided!")
   private String productCode;
   @Length(min = 1)
   private int quantity;
}
