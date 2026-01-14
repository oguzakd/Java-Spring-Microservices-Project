package com.oguzhanakduman.micro.service.impl;

import org.springframework.stereotype.Service;

import com.oguzhanakduman.micro.client.UserClient;
import com.oguzhanakduman.micro.dto.UserDto;
import com.oguzhanakduman.micro.kafka.OrderProducer;
import com.oguzhanakduman.micro.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

    private final UserClient userClient;
    private final OrderProducer orderProducer;

    public OrderServiceImpl(UserClient userClient, OrderProducer orderProducer) {
        this.userClient = userClient;
        this.orderProducer = orderProducer;
    }

    @Override
    public UserDto getUserFromOrder(Long id) {
        return userClient.getUserById(id);
    }

    @Override
    public void createTestOrder() {
        orderProducer.sendOrderCreatedEvent(1L, 5L);
    }

}
