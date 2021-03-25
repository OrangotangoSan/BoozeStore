package com.boozeApp.boozeApp.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class Order {

    @NotNull(message = "the order must have at least 1 item!")
    private List<Item> list;
}
