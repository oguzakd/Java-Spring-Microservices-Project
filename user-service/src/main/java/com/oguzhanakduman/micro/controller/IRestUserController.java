package com.oguzhanakduman.micro.controller;

import java.util.List;

import com.oguzhanakduman.micro.entitiy.User;

public interface IRestUserController {

	public List<User> getUsers();

	public User create(User user);

	public User getById(Long id);

	public User getByUsername(String username);
}
