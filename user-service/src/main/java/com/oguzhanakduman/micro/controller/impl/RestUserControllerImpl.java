package com.oguzhanakduman.micro.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oguzhanakduman.micro.controller.IRestUserController;
import com.oguzhanakduman.micro.entitiy.User;
import com.oguzhanakduman.micro.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class RestUserControllerImpl implements IRestUserController {

	private final UserServiceImpl userService;

	public RestUserControllerImpl(UserServiceImpl service) {
		this.userService = service;
	}

	@GetMapping
	@Override
	public List<User> getUsers() {
		return userService.getAll();
	}

	@PostMapping
	@Override
	public User create(@RequestBody User user) {
		return userService.save(user);
	}

	@GetMapping("/{id}")
	@Override
	public User getById(@PathVariable Long id) {
		return userService.getById(id);
	}

	@GetMapping("/username/{username}")
	@Override
	public User getByUsername(@PathVariable String username) {
		return userService.getByUsername(username);
	}

}
