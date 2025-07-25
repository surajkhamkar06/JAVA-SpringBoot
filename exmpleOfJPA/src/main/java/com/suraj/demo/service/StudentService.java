package com.suraj.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.demo.Repo.StudentRepository;

import model.Student;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository repo;
	
	
//	List<Student> students = Arrays.asList(new Student(101, "Vedant"),
//			new Student(102, "Prithvi"));


	public List<Student> getStudents()
	{
		return repo.findAll();
	}
	
	public Student getStudentById(int stdId)
	{
		return repo.findById(stdId).orElse(new Student(stdId, null));
	}
	
	public void addStudent(Student std)
	{
		repo.save(std);	
	}
	
	public void updateStudent(Student std)
	{
		repo.save(std);
	}
	
	public void deleteStudent(int stdId)
	{
		repo.deleteById(stdId);
	}
}
