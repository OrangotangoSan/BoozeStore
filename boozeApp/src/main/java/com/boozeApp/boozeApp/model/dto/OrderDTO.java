package com.boozeApp.boozeApp.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name ="orders")
public class OrderDTO {

    public OrderDTO(ClientDTO client, List<ItemDTO> listOfItems,String orderCode){
        this.client = client;
        this.boozeList = listOfItems;
        this.orderCode = orderCode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private ClientDTO client;

    @OneToMany(mappedBy = "order")
    private List<ItemDTO> boozeList;


    private String orderCode;


    private LocalDateTime date= LocalDateTime.now();
}
