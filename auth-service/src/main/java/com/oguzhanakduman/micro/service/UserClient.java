package com.oguzhanakduman.micro.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.oguzhanakduman.micro.dto.UserDto;

@Service
public class UserClient {

    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDto getUserByUsername(String username) {
        try {
            return restTemplate.getForObject("http://user-service/users/username/" + username, UserDto.class);
        } catch (Exception e) {
            return null;
        }
    }

    public UserDto createUser(UserDto userDto) {
        return restTemplate.postForObject("http://user-service/users", userDto, UserDto.class);
    }
}
