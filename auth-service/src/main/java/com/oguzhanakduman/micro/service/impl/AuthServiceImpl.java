package com.oguzhanakduman.micro.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.oguzhanakduman.micro.dto.LoginRequest;
import com.oguzhanakduman.micro.dto.LoginResponse;
import com.oguzhanakduman.micro.dto.RegisterRequest;
import com.oguzhanakduman.micro.dto.UserDto;
import com.oguzhanakduman.micro.service.IAuthService;
import com.oguzhanakduman.micro.service.UserClient;
import com.oguzhanakduman.micro.utils.JwtUtil;

@Service
public class AuthServiceImpl implements IAuthService {

    private final UserClient userClient;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(UserClient userClient, PasswordEncoder passwordEncoder) {
        this.userClient = userClient;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        UserDto user = userClient.getUserByUsername(request.username());
        if (user != null && passwordEncoder.matches(request.password(), user.getPassword())) {
            String token = JwtUtil.generateToken(request.username());
            return new LoginResponse(token);
        }
        return null;
    }

    @Override
    public LoginResponse register(RegisterRequest request) {
        UserDto userDto = new UserDto();
        userDto.setUsername(request.username());
        userDto.setPassword(passwordEncoder.encode(request.password()));
        userDto.setName(request.name());
        userDto.setEmail(request.email());

        userClient.createUser(userDto);

        String token = JwtUtil.generateToken(request.username());
        return new LoginResponse(token);
    }

}
