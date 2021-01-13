package com.boozestore.boozeApp.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String image;
    private String supplier;

}
