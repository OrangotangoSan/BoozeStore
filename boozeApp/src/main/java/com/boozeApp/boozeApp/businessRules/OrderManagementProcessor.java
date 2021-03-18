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
            // agora vai mandar a resquest de qualquer forma, sem validar qnt
            // o cód do produto vai ser add manulamente, mas depois devve vir direto do fornecedor


            //todo fazer um controller/rotas para adicionar produtos(seguindo o modelo do suppla)
            //todo  fazer a mesma validação de product code dos suplas

            //todo definir rotas para adicionar suppliers
            //todo definir os suplas e suas Base Url's
            //todo instaciar os produtos e suplas?

            //todo 3) Fazer a request - video java/Spring

            //todo 4) fazer um handler da resposta do Supla, e usá-lo na response
            //todo 4.a A reponse tem que conter tbm a order code, data e nome do cliente
            //todo 4.a.a É a partir do order code que vai vir o join
            // que chamamos de order product. orderCode->orderId->orderproduct


            productDTO.setProductCode(item.getProductCode());
            productDTO.setQuantity(item.getQuantity());
            //productRepository.save();

        });




    }
}
