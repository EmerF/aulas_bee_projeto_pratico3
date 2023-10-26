package com.ambev.projetopratico3.message;

import com.rabbitmq.client.*;

public class RabbitConsumer {
    private final static String QUEUE_NAME = "cadastroProdutos";

    public static void main(String[] args) throws Exception {
        // Configuração da fábrica de conexões com o servidor RabbitMQ.
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        // Início de um loop infinito para processar mensagens continuamente.
        while (true) {
            try (Connection connection = factory.newConnection();  // Cria uma nova conexão com o servidor RabbitMQ.
                 Channel channel = connection.createChannel()) {  // Cria um canal de comunicação na conexão.

                // Declara uma fila chamada QUEUE_NAME no servidor RabbitMQ.
                channel.queueDeclare(QUEUE_NAME, true, false, false, null);

                // Define uma função de retorno de chamada para processar as mensagens recebidas.
                DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                    // Converte a mensagem recebida em uma string com codificação UTF-8.
                    String message = new String(delivery.getBody(), "UTF-8");
                    System.out.println("Mensagem recebida: '" + message + "'");
                };

                // Registra o consumidor na fila QUEUE_NAME e associa a função de retorno de chamada.
                channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {
                });

                // Exibe uma mensagem informando que o consumidor foi iniciado e está aguardando mensagens.
                System.out.println("Consumidor iniciado. Aguardando mensagens...");

                // Coloca a thread para dormir indefinidamente, aguardando mensagens.
                Thread.sleep(Long.MAX_VALUE);
            }
        }
    }

}