package com.suraj.SpringSecBCrycptPass.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.suraj.SpringSecBCrycptPass.Model.Users;
import com.suraj.SpringSecBCrycptPass.Repo.UserRepo;

@Service
public class UserService 
{
	@Autowired
	private UserRepo repo;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	public Users register(Users user)
	{
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
		
	}

}
