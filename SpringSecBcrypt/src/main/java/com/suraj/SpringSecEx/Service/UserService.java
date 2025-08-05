package com.suraj.SpringSecEx.Service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.suraj.SpringSecEx.Model.Users;
import com.suraj.SpringSecEx.Repo.UserRepo;

@Service
public class UserService
{
	private UserRepo repo;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users register(Users user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
		
	}

}
