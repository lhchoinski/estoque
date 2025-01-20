package com.system.estoque.consumers;

import com.system.estoque.dtos.SaleItemDTO;
import com.system.estoque.dtos.entities.StockExitDTO;
import com.system.estoque.services.StockExitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@Slf4j
public class StockConsumer {

    private final StockExitService stockExitService;

    @RabbitListener(queues = "stock_queue")
    public void listenSaleQueue(@Payload SaleItemDTO saleItemDTO) {
        log.info("Stock exit received: {}", saleItemDTO.getItemId());
        log.info("Stock exit received: {}", saleItemDTO.getQuantity());

        UUID uuid = UUID.fromString("69da7132-2d43-4353-8de7-757f4f0f5a69");

        StockExitDTO stockExitDTO = new StockExitDTO();
        stockExitDTO.setItemId(saleItemDTO.getItemId());
//        stockExitDTO.setUserId(saleItemDTO.getSale().getUser().getId());
        stockExitDTO.setUserId(uuid);
        stockExitDTO.setQuantity(saleItemDTO.getQuantity());

        try {
            stockExitService.create(stockExitDTO);
        } catch (Exception e) {
            log.error("Error processing sale item from queue", e);
        }
    }
}
