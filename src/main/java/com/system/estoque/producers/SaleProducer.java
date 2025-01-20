//package com.system.estoque.producers;
//
//import com.system.estoque.dtos.EmailDTO;
//import com.system.estoque.dtos.SaleDTO;
//import com.system.estoque.dtos.entities.ItemDTO;
//import com.system.estoque.dtos.entities.UserDTO;
//import com.system.estoque.entities.Item;
//import com.system.estoque.entities.StockExit;
//import com.system.estoque.entities.User;
//import com.system.estoque.mappers.ItemMapper;
//import com.system.estoque.mappers.UserMapper;
//import lombok.RequiredArgsConstructor;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class SaleProducer {
//
//    private final RabbitTemplate rabbitTemplate;
//    private final ItemMapper itemMapper;
//    private final UserMapper userMapper;
//
//    @Value(value = "stock.#")
//    private String routingKey;
//
//    public void sendSaleToQueue(StockExit stockExit) {
//
//        SaleDTO saleDTO = new SaleDTO();
//
//        ItemDTO item = itemMapper.toDto(stockExit.getItem());
//        UserDTO user = userMapper.toDto(stockExit.getUser());
//
//        saleDTO.setItem(item);
//        saleDTO.setUser(user);
//
//        rabbitTemplate.convertAndSend("stock_exchange", routingKey, saleDTO);
//    }
//}
