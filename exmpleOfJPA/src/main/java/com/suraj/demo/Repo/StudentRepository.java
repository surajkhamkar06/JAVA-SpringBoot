package com.suraj.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
