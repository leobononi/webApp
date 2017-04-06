package com.boot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
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
		return userService.getAll();	
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST) 
	public Object save(@RequestBody @Valid User user, BindingResult bindingResult){
		if (!bindingResult.hasErrors()) 
			return userService.saveOrUpdate(user);
		
		return bindingResult.getFieldError();
	}
	
	@RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
	public User Delete(@PathVariable int id){
		return userService.delete(id);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public User Update(@RequestBody User user){
		return userService.saveOrUpdate(user); 
	}
	
	@RequestMapping(value="/show/{id}", method = RequestMethod.GET)
	public User Show(@PathVariable int id){
		return userService.get(id);
	}
}
