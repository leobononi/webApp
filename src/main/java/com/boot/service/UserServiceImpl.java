package com.boot.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.boot.model.User;

@Service
public class UserServiceImpl implements UserService {

	private List<User> userList = new ArrayList<User>();
	
	@Override
	public List<User> GetAll() {
		return userList;
	}

	@Override
	public User Save(User user) {
		user.setId(userList.size() + 1);
		userList.add(user);
		return user;
	}

	@Override
	public User Delete(int id) {
		  User user = userList.stream()
				.filter((m) -> m.getId() == id)
				.findFirst().get();
		 
		userList.remove(user);
		
		return user;
			
	}

	@Override
	public User Get(int id) {
		return userList.stream()
				.filter((m) -> m.getId() == id)
				.findFirst().get();
	}

}
