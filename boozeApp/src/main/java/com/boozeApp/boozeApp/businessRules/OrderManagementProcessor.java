package com.boozeApp.boozeApp.businessRules;

import com.boozeApp.boozeApp.model.Client;
import com.boozeApp.boozeApp.model.Item;
import com.boozeApp.boozeApp.model.Order;
import com.boozeApp.boozeApp.model.dto.ClientDTO;
import com.boozeApp.boozeApp.model.dto.ItemDTO;
import com.boozeApp.boozeApp.model.dto.OrderDTO;
import com.boozeApp.boozeApp.model.dto.ProductDTO;
import com.boozeApp.boozeApp.model.request.OrderRequest;
import com.boozeApp.boozeApp.model.response.OrderResponse;
import com.boozeApp.boozeApp.model.response.StatusOrder;
import com.boozeApp.boozeApp.repository.ItemRepository;
import com.boozeApp.boozeApp.repository.OrderRepository;
import com.boozeApp.boozeApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderManagementProcessor {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ItemRepository itemRepository;

//todo fazer o supplier handler


    public OrderResponse processOrderRequest(OrderRequest or){

        Client client = or.getClient();

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setName(client.getName());
        clientDTO.setEmail(client.getEmail());

        Order order = or.getOrder();

        List<Item> ordersList = order.getList();

        List<ItemDTO> savedList = new ArrayList<>();

        List<Item> unsavedList = new ArrayList<>();

        OrderDTO orderDTO = new OrderDTO(clientDTO, savedList, OrderCodeGenerator.generateOrderCode());
        ItemDTO itemDTO = new ItemDTO();


        ordersList.forEach(item -> {

            ProductDTO productDTO = productRepository.findProductByProductCode(item.getProductCode());

            if (productDTO != null){
                itemDTO.setProduct(productDTO);
                itemDTO.setQuantity(item.getQuantity());
                itemDTO.setOrder(orderDTO);
                savedList.add(itemDTO);

            } else{
                unsavedList.add(item);
            }


        });



        orderRepository.save(orderDTO);
        itemRepository.saveAll(savedList);

        //todo falta uma verificação
        //todo algo para fazer com a unsaved list
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setMessage("your order has been made!");
        orderResponse.setStatusOrder(StatusOrder.OK);


        return orderResponse;
    }



}
