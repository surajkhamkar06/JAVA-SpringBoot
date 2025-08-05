package com.suraj.SpringSecEx.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.SpringSecEx.Model.Users;
import com.suraj.SpringSecEx.Service.UserService;

@RestController
public class UserController
{
	private UserService service;
	
	@GetMapping("/register")
	public Users register(@RequestBody Users user)
	{
		return service.register(user);
		
	}

}
