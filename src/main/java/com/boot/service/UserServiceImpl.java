package com.boot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.boot.model.User;

@Service
public class UserServiceImpl implements UserService {

	private List<User> userList = new ArrayList<User>();
	public UserServiceImpl(){
		userList.add(new User(1, "FirstName1", "LastName1", "user1@mail.com"));
		userList.add(new User(2, "FirstName2", "LastName2", "user2@mail.com"));
		userList.add(new User(3, "FirstName3", "LastName3", "user3@mail.com"));
		userList.add(new User(4, "FirstName4", "LastName4", "user4@mail.com"));
		userList.add(new User(5, "FirstName5", "LastName5", "user5@mail.com"));
	}
	
	@Override
	public List<User> GetAll() {
		return userList;
	}

	@Override
	public User Save(User user) {
		userList.add(user);
		return user;
	}

}
