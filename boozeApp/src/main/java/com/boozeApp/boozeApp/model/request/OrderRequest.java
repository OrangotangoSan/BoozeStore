package com.boozeApp.boozeApp.model.request;

import com.boozeApp.boozeApp.model.Client;
import com.boozeApp.boozeApp.model.Order;
import com.boozeApp.boozeApp.model.dto.ItemDTO;
import com.boozeApp.boozeApp.model.dto.OrderDTO;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
public class OrderRequest {


    private Client client;


    @NotNull(message = "there must have an order")
    private Order order;


}
