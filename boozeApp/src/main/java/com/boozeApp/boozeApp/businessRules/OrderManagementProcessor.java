package com.boozeApp.boozeApp.businessRules;

import com.boozeApp.boozeApp.model.Order;
import com.boozeApp.boozeApp.model.Item;
import com.boozeApp.boozeApp.model.dto.OrderDTO;
import com.boozeApp.boozeApp.model.dto.OrderProductDTO;
import com.boozeApp.boozeApp.model.dto.ProductDTO;
import com.boozeApp.boozeApp.model.request.OrderRequest;
import com.boozeApp.boozeApp.model.response.OrderResponse;
import com.boozeApp.boozeApp.repository.OrderRepository;
import com.boozeApp.boozeApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URL;
import java.util.List;

@Service
public class OrderManagementProcessor {


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public OrderResponse processOrderRequest(OrderRequest or){

        //todo salvar a order em OrderProduct - O productId e a quantidade
        //todo instanciar order response

        saveClientName(or);


        return null;
    }

    public void saveClientName(OrderRequest or){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setClientName(or.getClientName());
        orderRepository.save(orderDTO);
    }

    public void sendClientOrder(OrderRequest or){
        Order order = or.getOrder();
        List<Item> orderItensList = order.getItensList();

        orderItensList.forEach(item -> {
            ProductDTO productDTO = new ProductDTO();

            //todo 1) fazer verificação na própria db por cod. produto e Qnt

            //todo 1.a criar uma rota para add produtos na table produtos do APP
            //todo 1.b verificar se o nome da table coincide com os já existentes
            //todo 1.c fazer a mesma validação de product code e qnt dos suplas

            //todo 2)  definir os suplas e suas Base Url's
            //todo 2.a instaciar os produtos e suplas?

            //todo 3) Fazer a request - video java/Spring

            //todo 4) fazer um handler da resposta do Supla, e usá-lo na response
            //todo 4.a A reponse tem que conter tbm a order code!
            //todo 4.a.a É a partir do order code que vai vir o join que chamamos de order product


            productDTO.setProductCode(item.getProductCode());
            productDTO.setQuantity(item.getQuantity());
            //productRepository.save();

        });




    }
}
