package com.suraj.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@RequestMapping("/")
	public String greet()
	{
		return("Welcome to Springboot");
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return("I am coder");
	}

}
