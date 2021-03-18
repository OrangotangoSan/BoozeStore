package com.boozeApp.boozeApp.businessRules.validations;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderError {

    private String field;

    private String message;


}
