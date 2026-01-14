package com.oguzhanakduman.micro.service;

import com.oguzhanakduman.micro.dto.UserDto;

public interface IOrderService {

    public UserDto getUserFromOrder(Long id);

    public void createTestOrder();
}
