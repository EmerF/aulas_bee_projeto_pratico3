package com.ambev.projetopratico3.message;

import com.rabbitmq.client.*;

public class RabbitConsumer {
    private final static String QUEUE_NAME = "cadastroProdutos";

    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");


        while (true) {
            try (Connection connection = factory.newConnection();
                 Channel channel = connection.createChannel()) {


                channel.queueDeclare(QUEUE_NAME, true, false, false, null);


                DeliverCallback deliverCallback = (consumerTag, delivery) -> {

                    String message = new String(delivery.getBody(), "UTF-8");
                    System.out.println("Mensagem recebida: '" + message + "'");
                };


                channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {
                });


                System.out.println("Consumidor iniciado. Aguardando mensagens...");


                Thread.sleep(Long.MAX_VALUE);
            }
        }
    }

}
