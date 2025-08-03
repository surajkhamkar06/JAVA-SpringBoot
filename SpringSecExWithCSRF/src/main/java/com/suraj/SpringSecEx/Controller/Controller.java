package com.suraj.SpringSecEx.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Controller 
{
	@GetMapping("/")
	public String greet(HttpServletRequest request)
	{
		return "Welcome in Spring Security" + request.getSession().getId();
	}

}
