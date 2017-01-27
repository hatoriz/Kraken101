package com.example;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by hatoriz on 1/27/17.
 */
@Component
@Lazy
public class Sender {

    @Autowired
    RabbitMessagingTemplate template;

    @Bean
    Queue queue() {
        return new Queue("CustomerQ", false);
    }

    public void send(String message) {
        template.convertAndSend("CustomerQ", message);
    }
}
