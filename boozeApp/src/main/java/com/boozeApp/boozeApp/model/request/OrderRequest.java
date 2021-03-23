package com.boozeApp.boozeApp.model.request;

import com.boozeApp.boozeApp.model.dto.ItemDTO;
import com.boozeApp.boozeApp.model.dto.OrderDTO;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
public class OrderRequest {

    @Length(min = 3,message = "Client name must have at least 3 characters!")
    @NotBlank(message ="Client Name must not be blank!")
    private String name;

    @NotBlank(message = "Don't be lazy. Type your email...")
    private String  email;

    @NotNull(message = "there must be at least 1 item!")
    private List<ItemDTO> items;



}
