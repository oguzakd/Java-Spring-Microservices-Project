package com.oguzhanakduman.micro.client;

import org.springframework.stereotype.Component;

import com.oguzhanakduman.micro.dto.UserDto;

@Component
public class UserClientFallback implements UserClient {

	@Override
	public UserDto getUserById(Long id) {

		return new UserDto(id, "UNKNOWN USER", "SERVICE UNAVAILABLE");
	}
}
