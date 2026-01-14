package com.oguzhanakduman.micro.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.oguzhanakduman.micro.dto.LoginRequest;
import com.oguzhanakduman.micro.dto.LoginResponse;
import com.oguzhanakduman.micro.dto.RegisterRequest;

import jakarta.validation.Valid;

public interface IRestAuthController {

    public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest request);

    public ResponseEntity<LoginResponse> register(@RequestBody @Valid RegisterRequest request);
}
