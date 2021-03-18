package com.boozeApp.boozeApp.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
public class Order {

    @Length(min = 1)
    private List<Item> ItensList;
}
