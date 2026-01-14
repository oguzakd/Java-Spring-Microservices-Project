package com.oguzhanakduman.micro.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.oguzhanakduman.micro.dto.UserDto;

@FeignClient(name = "user-service", path = "/users", fallback = UserClientFallback.class)
public interface UserClient {
	@GetMapping("/{id}")
	UserDto getUserById(@PathVariable("id") Long id);
}
