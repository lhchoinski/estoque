package com.system.estoque.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class StockListener {

    @RabbitListener(queues = "stock.queue")
    public String updateStock(String saleData) {
        System.out.println("Stock: Atualizando estoque para a venda: " + saleData);

        boolean stockUpdated = true; // Simula a atualização de estoque

        // Se o estoque foi atualizado com sucesso, retorna para POS
        if (stockUpdated) {
            return "Venda concluída com sucesso!";
        } else {
            return "Erro: Estoque insuficiente.";
        }
    }
}
