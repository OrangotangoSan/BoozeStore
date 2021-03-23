package com.boozeApp.boozeApp.model.dto;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "clients")

public class ClientDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "client")
    private List<OrderDTO> clientOrder;

    @NotBlank
    private String name;

    private String email;

}
