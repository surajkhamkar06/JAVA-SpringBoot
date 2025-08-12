package com.suraj.SpringSecBCrycptPass.Service;

import org.springframework.stereotype.Service;

@Service
public class JWTService 
{

	public String generateToken()
	{
		return ".eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6Ik5hdmluIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0";
	}

}
