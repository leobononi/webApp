package com.boot.service;

import java.util.List;

import com.boot.model.User;

public interface UserService {

	List<User> GetAll();
	User Save(User user);
}
