package com.oguzhanakduman.micro.service;

import com.oguzhanakduman.micro.dto.LoginRequest;
import com.oguzhanakduman.micro.dto.LoginResponse;
import com.oguzhanakduman.micro.dto.RegisterRequest;

public interface IAuthService {

    public LoginResponse login(LoginRequest request);

    public LoginResponse register(RegisterRequest request);
}
