package com.suraj.SpringDemo;

public class Dev 
{
	private Laptop laptop;
	private int age ;
	
	public Dev(Laptop laptop) 
	{
		this.laptop = laptop;
		System.out.println("Dev Contructor 1");
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	


	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void build()
	{
		System.out.println("Working on Awesome Project");
		laptop.compile();
	}
}
