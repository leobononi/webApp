package com.boot.service;

import java.util.List;

import com.boot.model.User;

public interface UserService extends BaseService<User> {
	User saveOrUpdate(User user);
	User delete(int id);
}
