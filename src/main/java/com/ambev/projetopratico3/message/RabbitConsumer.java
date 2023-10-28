package com.ambev.projetopratico3.message;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class RabbitConsumer {

    private final static String QUEUE_NAME = "cadastroProdutos";

    public static void main(String[] args) throws Exception {
         ConnectionFactory factory = new ConnectionFactory();
         factory.setHost("localhost");

         try (Connection connection = factory.newConnection()) {
            Channel channel = connection.createChannel();

             channel.queueDeclare(QUEUE_NAME, false, false, false, null);

             System.out.println(" [*] Aguardando mensagens. Para sair pressione CTRL+C");
             DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                 String message = new String(delivery.getBody(), "UTF-8");
                 System.out.println(" [x] Recebido '" + message + "'");
             };

             channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
        }
    }
}
