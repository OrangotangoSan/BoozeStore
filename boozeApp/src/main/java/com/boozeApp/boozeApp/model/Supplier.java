package com.boozeApp.boozeApp.model;

import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

@Data
public class Supplier {

    private String name;
    private String supplierCode;
    private String orderRoute;

    //todo fazer esquema UML igual ao da request

}
