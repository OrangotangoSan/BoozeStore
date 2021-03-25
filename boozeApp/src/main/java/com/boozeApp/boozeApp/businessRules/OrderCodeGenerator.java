package com.boozeApp.boozeApp.businessRules;


import java.util.Random;


public class OrderCodeGenerator {

    public static String generateOrderCode(){

        Random random = new Random();

        int [] initialCode = new int[10];
        String finalCode= "";

        for (int i=0; i<10; i++){
            initialCode[i]= random.nextInt(9);
            finalCode+= initialCode[i];
        }


        return finalCode;
    }
}
