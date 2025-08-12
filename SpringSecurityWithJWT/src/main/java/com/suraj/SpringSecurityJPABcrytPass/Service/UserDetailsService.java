package com.suraj.SpringSecurityJPABcrytPass.Service;

import com.suraj.SpringSecurityJPABcrytPass.Model.Student;
import com.suraj.SpringSecurityJPABcrytPass.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class  UserDetailsService implements AuthenticationUserDetailsService{

    @Autowired
    private StudentRepository studentRepository;

    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Student student = studentRepository.findByName(name)
                .orElseThrow(() -> new UsernameNotFoundException("Student not found with name: " + name));

        return new org.springframework.security.core.userdetails.User(
                student.getName(),
                student.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }

	@Override
	public UserDetails loadUserDetails(Authentication token) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
