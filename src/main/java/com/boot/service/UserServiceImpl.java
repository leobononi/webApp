package com.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.model.User;

@Service
public class UserServiceImpl implements UserService {

	private List<User> userList = new ArrayList<User>();
	
	@Override
	public List<User> getAll() {
		return userList;
	}

	@Override
	public User saveOrUpdate(User user) {
		if (user.getId() == 0){
			user.setId(userList.size() + 1);
			userList.add(user);
			
		}else{
			userList.set(0, user);
		}
		return user;
	}

	@Override
	public User delete(int id) {
		  User user = userList.stream()
				.filter((m) -> m.getId() == id)
				.findFirst().get();
		 
		userList.remove(user);
		
		return user;
			
	}

	@Override
	public User get(int id) {
		return userList.stream()
				.filter((m) -> m.getId() == id)
				.findFirst().get();
	}

}
