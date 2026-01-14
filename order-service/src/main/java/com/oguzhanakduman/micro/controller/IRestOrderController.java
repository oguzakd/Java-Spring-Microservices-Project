package com.oguzhanakduman.micro.controller;

import org.springframework.http.ResponseEntity;

import com.oguzhanakduman.micro.dto.UserDto;

public interface IRestOrderController {

    public UserDto getUserFromOrder(Long id);

    public ResponseEntity<String> test();
}
