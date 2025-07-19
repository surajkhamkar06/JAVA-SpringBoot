package com.suraj.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.Service.StudentService;

import model.Student;

@RestController
public class StudentController 
{
	@Autowired
	StudentService service;
	
	@RequestMapping("/data")
	public List<Student> getStudent() 
	{
		return service.getStudents();	
	}
}
