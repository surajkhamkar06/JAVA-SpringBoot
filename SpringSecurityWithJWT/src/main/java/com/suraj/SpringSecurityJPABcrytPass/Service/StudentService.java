package com.suraj.SpringSecurityJPABcrytPass.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.suraj.SpringSecurityJPABcrytPass.Model.Student;
import com.suraj.SpringSecurityJPABcrytPass.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public Student save(Student student) {
        student.setPassword(encoder.encode(student.getPassword()));
        return repository.save(student);
    }

    public Student getByName(String name) {
        return repository.findByName(name);
    }
}