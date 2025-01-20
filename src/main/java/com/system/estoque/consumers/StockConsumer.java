package com.system.estoque.consumers;

import com.system.estoque.dtos.SaleItemDTO;
import com.system.estoque.dtos.entities.StockExitDTO;
import com.system.estoque.services.StockExitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class StockConsumer {

    private final StockExitService stockExitService;
    private final RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "stock_queue")
    public void listenSaleQueue(@Payload SaleItemDTO saleItemDTO) {

        UUID uuid = UUID.fromString("74a3c254-3ea9-4ab3-9c2b-480001b06f39");

        StockExitDTO stockExitDTO = new StockExitDTO();
        stockExitDTO.setItemId(saleItemDTO.getItemId());
        stockExitDTO.setUserId(uuid);
        stockExitDTO.setQuantity(saleItemDTO.getQuantity());

        try {
            log.info("Processing stock exit for Item ID: {} and Quantity: {}",
                    saleItemDTO.getItemId(), saleItemDTO.getQuantity());
            stockExitService.create(stockExitDTO);
            log.info("Stock exit processed successfully for Item ID: {}", saleItemDTO.getItemId());
        } catch (Exception e) {
            log.error("Error processing sale item from queue, sending to DLQ. Item ID: {}",
                    saleItemDTO.getItemId(), e);

            rabbitTemplate.convertAndSend("stock_dead_queue", saleItemDTO);
        }
    }
}
