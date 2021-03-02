package com.supla1.businessRules;

import com.supla1.model.dto.Product;
import com.supla1.model.request.OrderRequest;
import com.supla1.model.response.OrderResponse;
import com.supla1.model.response.StatusOrder;
import com.supla1.repository.ProductRepositoryA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SupplierAManagementProcessor {

    @Autowired
    private ProductRepositoryA productRepositoryA;

    public OrderResponse processOrderRequest(OrderRequest or) {

        String productCode = or.getProductCode();
        Product product = productRepositoryA.findProductByProductCode(productCode);
        OrderResponse orderResponse = new OrderResponse();

        if (product.getQuantity() < or.getQuantity()){
            orderResponse.setMessage("Unable to process your order");
            orderResponse.setStatusOrder(StatusOrder.KO);
        } else {
            product.setQuantity(product.getQuantity() - or.getQuantity());
            productRepositoryA.save(product);
            orderResponse.setMessage("Order processed succcessfully");
            orderResponse.setStatusOrder(StatusOrder.OK);
            BigDecimal quantity = new BigDecimal(or.getQuantity());
            orderResponse.setTotalAmount(product.getPrice().multiply(quantity));
        }
        return orderResponse;
    }


}
