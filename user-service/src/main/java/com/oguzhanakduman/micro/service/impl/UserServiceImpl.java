package com.oguzhanakduman.micro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.oguzhanakduman.micro.entitiy.User;
import com.oguzhanakduman.micro.repository.UserRepository;
import com.oguzhanakduman.micro.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository repository) {
		this.userRepository = repository;
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (!optionalUser.isEmpty()) {
			return optionalUser.get();
		}
		User emptyUser = new User();
		emptyUser.setId(id);
		emptyUser.setName("empty user");
		emptyUser.setEmail("emptyuser@emptyuser.com");
		return emptyUser;
	}

	@Override
	public User getByUsername(String username) {
		return userRepository.findByUsername(username).orElse(null);
	}

}
