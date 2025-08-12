package com.suraj.SpringSecurityJPABcrytPass.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suraj.SpringSecurityJPABcrytPass.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{
	Optional<Student> findByName(String name);

}
