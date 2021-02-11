package com.supla2.businessLogic;

import com.supla2.model.dto.Product;
import com.supla2.model.request.OrderRequest;
import com.supla2.model.response.OrderResponse;
import com.supla2.model.response.StatusOrder;
import com.supla2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SupplierBmanagementProcessor {

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
            orderResponse.setMessage("Order processed successfully");
            orderResponse.setStatusOrder(StatusOrder.OK);
            BigDecimal quantity = new BigDecimal(or.getQuantity());
            orderResponse.setTotalAmount(product.getPrice().multiply(quantity));
        }

        return orderResponse;
    }
}
