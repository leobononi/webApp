package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.User;
import com.boot.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> list(){	
		return userService.GetAll();	
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public User save(@RequestBody User user){
		return userService.SaveOrUpdate(user);		
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public User Delete(@PathVariable int id){
		return userService.Delete(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public User Update(@RequestBody User user){
		return userService.SaveOrUpdate(user); 
	}
	
	@RequestMapping(value="/show/{id}", method = RequestMethod.GET)
	public User Show(@PathVariable int id){
		return userService.Get(id);
	}
}
