package com.techwasti.kafkaex;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface GreetMessageClient {

    // greet is a kafka topic
    @Topic("greet")
    void sendGreetMessage(@KafkaKey String day, String message);

    void sendGreetMessage(@Topic String topic, @KafkaKey String day, String message);
}