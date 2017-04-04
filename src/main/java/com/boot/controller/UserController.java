package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.User;
import com.boot.service.UserService;

//import com.boot.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> list(){	
		return userService.GetAll();	
	}
	
	@RequestMapping(value="/user/save", method = RequestMethod.POST)
	public User save(@RequestBody User user){
		return userService.Save(user);		
	}
	
}
