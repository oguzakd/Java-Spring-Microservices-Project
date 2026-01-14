package com.oguzhanakduman.micro.event;

public class OrderCreatedEvent {

    private Long orderId;
    private Long userId;

    public OrderCreatedEvent() {}

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }
}
