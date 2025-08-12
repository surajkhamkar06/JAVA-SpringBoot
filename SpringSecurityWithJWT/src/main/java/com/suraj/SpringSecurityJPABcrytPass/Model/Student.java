package com.suraj.SpringSecurityJPABcrytPass.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
    
}
