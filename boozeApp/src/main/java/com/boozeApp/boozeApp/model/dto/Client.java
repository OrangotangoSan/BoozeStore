package com.boozeApp.boozeApp.model.dto;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Client {

    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    private String email;
    @OneToMany
    private List<Order> orderList;

}
