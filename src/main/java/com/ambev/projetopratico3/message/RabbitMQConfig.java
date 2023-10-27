package com.ambev.projetopratico3.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue queue(){
        return new Queue("cadastroProdutos");
    }

}
