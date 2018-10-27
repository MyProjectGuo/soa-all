package com.dubbo.soa.all.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.soa.all.config.LoginRequired;
import com.dubbo.soa.all.config.Result;
import com.dubbo.soa.all.config.ServiceException;
import com.dubbo.user.model.User;
import com.dubbo.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@PostMapping("getUserById")
	@LoginRequired
	public Result<User> getUserById(Long id , HttpServletRequest request) throws ServiceException{
		User user = userService.getUserById(1L);
		return new Result(user);
	}
	
	
	@PostMapping("send")
	public Result<Boolean> send(){
		userService.sendUserMQ();
		return new Result(true);
	}
	
}
