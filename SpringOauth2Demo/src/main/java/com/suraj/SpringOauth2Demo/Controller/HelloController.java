package com.suraj.SpringOauth2Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	
    @GetMapping("/")
    public String greet() 
    {
        return "Welcome to Telusko, telusko.com";
    }
}