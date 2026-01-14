package com.oguzhanakduman.micro.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oguzhanakduman.micro.controller.IRestOrderController;
import com.oguzhanakduman.micro.dto.UserDto;
import com.oguzhanakduman.micro.service.IOrderService;

@RestController
@RequestMapping("/orders")
public class RestOrderControllerImpl implements IRestOrderController {

    private final IOrderService orderService;

    public RestOrderControllerImpl(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    @GetMapping("/user/{id}")
    public UserDto getUserFromOrder(@PathVariable Long id) {
        return orderService.getUserFromOrder(id);
    }

    @Override
    @PostMapping("/test")
    public ResponseEntity<String> test() {
        orderService.createTestOrder();
        return ResponseEntity.ok("Order event sent");
    }

}
