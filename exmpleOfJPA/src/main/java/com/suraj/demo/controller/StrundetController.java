package com.suraj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.demo.service.StudentService;

import model.Student;

@RestController
@RequestMapping
public class StrundetController 
{
	@Autowired
	private StudentService service;

	@GetMapping("/Std")
	List<Student> getStudents()
	{
		return service.getStudents();
	}

	@GetMapping("/Std/{id}")
	public Student getStudent(@PathVariable int stdId)
	{
		return service.getStudentById(stdId);
	}

	@PostMapping("/Std")
	public void addStudent(@RequestBody Student std)
	{
		service.addStudent(std);
	}


	public void updateStudent(Student std) 
	{
		service.updateStudent(std);

	}

}
