package com.dubbo.soa.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.user.model.User;
import com.dubbo.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("getUserById")
	public User getUserById(Long id){
		
		return userService.getUserById(1L);
	}
}
