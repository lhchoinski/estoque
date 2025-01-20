package com.system.estoque.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "stock_exchange";
    public static final String QUEUE_NAME = "stock_queue";
    public static final String STOCK_DEAD_QUEUE = "stock_dead_queue";

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME, true);
    }

    @Bean
    public Queue stockDeadQueue() {
        return new Queue(STOCK_DEAD_QUEUE, true, false, false);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("stock.#");
    }

    @Bean
    public Binding stockDeadBinding() {
        return BindingBuilder.bind(stockDeadQueue()).to(exchange()).with(STOCK_DEAD_QUEUE);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}
