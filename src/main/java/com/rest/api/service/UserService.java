package com.rest.api.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.entity.User;
import com.rest.api.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRep;

	public List<User> getAllUsers() {
		return userRep.findAll();
	}

	public Optional<User> getUserById(Long id) {
		return userRep.findById(id);
	}

	public void deleteUserById(Long id) {
		userRep.deleteById(id);

	}

	public User saveUser(User user) {
		User savedUser = userRep.save(user);
		return savedUser;

	}

	public User updateUser(Long id, User userDetails) {
		User user = userRep.findById(id)
				.orElseThrow(() -> new RuntimeException("resource not found with id " + id));
		user.setName(userDetails.getName());
		user.setEmail(userDetails.getEmail());
		return userRep.save(user);
	}

}
