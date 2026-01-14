package com.oguzhanakduman.micro.service;

import java.util.List;

import com.oguzhanakduman.micro.entitiy.User;

public interface IUserService {

	public List<User> getAll();

	public User save(User user);

	public User getById(Long id);

	public User getByUsername(String username);
}
