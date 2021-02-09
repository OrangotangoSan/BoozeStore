package com.supla3.businessRules;

import com.supla3.model.dto.Product;
import com.supla3.model.request.OrderRequest;
import com.supla3.model.response.OrderResponse;
import com.supla3.model.response.StatusOrder;
import com.supla3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SupplierCManagementProcessor {

    @Autowired
    private ProductRepository productRepository;





    public OrderResponse processOrderRequest(OrderRequest or) {
        String productCode = or.getProductCode();

       Product product = productRepository.findProductCode(productCode);

       OrderResponse orderResponse = new OrderResponse();

       if (product.getQuantity() < or.getQuantity()){
           orderResponse.setMessage("Unable to process your order");
           orderResponse.setStatusOrder(StatusOrder.KO);
       } else {
           product.setQuantity(product.getQuantity() - or.getQuantity());
            productRepository.save(product);
            orderResponse.setMessage("order processed successfully");
            orderResponse.setStatusOrder(StatusOrder.OK);
            BigDecimal quantity = new BigDecimal(or.getQuantity());
            orderResponse.setTotalAmount(product.getPrice().multiply(quantity));
       }


        return orderResponse;

    }





}
