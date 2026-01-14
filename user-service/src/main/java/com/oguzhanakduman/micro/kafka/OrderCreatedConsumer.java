package com.oguzhanakduman.micro.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.oguzhanakduman.micro.event.OrderCreatedEvent;

@Service
public class OrderCreatedConsumer {
    @KafkaListener(
            topics = "order-created",
            groupId = "user-service-group"
        )
        public void consume(OrderCreatedEvent event) {

            System.out.println("🔥 Order event consumed!");
            System.out.println("OrderId: " + event.getOrderId());
            System.out.println("UserId: " + event.getUserId());
        }
}
