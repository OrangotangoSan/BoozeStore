package com.boozeApp.boozeApp.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class Client {

    @Length(min = 3,message = "Client name must have at least 3 characters!")
    @NotBlank(message ="Client Name must not be blank!")
    private String name;

    @NotBlank(message = "Don't be lazy. Type your email  :)")
    private String email;


}
