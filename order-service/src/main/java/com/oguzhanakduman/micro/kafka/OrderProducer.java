package com.oguzhanakduman.micro.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.oguzhanakduman.micro.event.OrderCreatedEvent;

@Service
public class OrderProducer {
    private final KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate;

    public OrderProducer(KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrderCreatedEvent(Long orderId, Long userId) {

        OrderCreatedEvent event =
                new OrderCreatedEvent(orderId, userId);

        kafkaTemplate.send("order-created", event);
    }
}
