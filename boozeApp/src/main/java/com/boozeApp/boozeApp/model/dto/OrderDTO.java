package com.boozeApp.boozeApp.model.dto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name ="orders")
public class OrderDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private ClientDTO client;

    @OneToMany(mappedBy = "order")
    private List<ItemDTO> boozeList;


    private String orderCode;


    private LocalDateTime date;
}
