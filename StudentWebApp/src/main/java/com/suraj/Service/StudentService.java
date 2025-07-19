package com.suraj.Service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import model.Student;

@Service
public class StudentService 
{
	List<Student> students = Arrays.asList(new Student(101, "Vedant", "Nanded"));
	
	
	public List<Student> getStudents()
	{
		return students;
	}

}
