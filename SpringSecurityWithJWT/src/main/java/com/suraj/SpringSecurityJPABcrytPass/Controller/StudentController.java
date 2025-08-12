package com.suraj.SpringSecurityJPABcrytPass.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.suraj.SpringSecurityJPABcrytPass.Model.Student;
import com.suraj.SpringSecurityJPABcrytPass.Service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/register")
    public Student register(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to secured student API";
    }
}
