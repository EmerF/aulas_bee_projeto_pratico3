package com.ambev.projetopratico3.message;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQCConfig {
    @Bean
    public Queue queue() {
        return new Queue("my-queue");
    }
}
