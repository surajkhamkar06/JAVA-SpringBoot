package com.suraj.SpringSecBCrycptPass.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.suraj.SpringSecBCrycptPass.Model.Users;
import com.suraj.SpringSecBCrycptPass.Service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService service;
	
// Register new user
	
	@PostMapping("/register")
	public Users register(@RequestBody Users user)
	{
		return service.register(user);
		
	}
	
//Login user
	
	@PostMapping("/login")
	public String login(@RequestBody Users user)
	{
		return service.verify(user);
	}
}
