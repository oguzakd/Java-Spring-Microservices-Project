package com.oguzhanakduman.micro.event;

public class OrderCreatedEvent {
    private Long orderId;
    private Long userId;

    public OrderCreatedEvent() {}

    public OrderCreatedEvent(Long orderId, Long userId) {
        this.orderId = orderId;
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }
}
