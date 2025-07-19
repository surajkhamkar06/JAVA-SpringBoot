package model;

import org.springframework.stereotype.Component;

@Component
public class Student
{
	private int id;
	private String name;
	private String Loc;
	
	public Student(int id, String name, String loc) {
		this.id = id;
		this.name = name;
		Loc = loc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}
	
}
