package com.techwasti.kafkaex;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class GreetMessageConsumer {

    @Topic("greet")
    public void receive(@KafkaKey String day, String message) {
        System.out.println("Got Message for the  - " + day + " and Message is  " + message);
    }
}
