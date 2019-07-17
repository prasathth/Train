package com.pack.springmvc.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Employee {
	
	@Range(min=1,message="minimum length is 1")
	private int id;
	@Size(min=2,message="min 2 character")
	private String name;
	private String password;
	//@NotEmpty(message="enter age")
	@Range(min=1)
	private int age;
	private double salary;
	
	public Employee(int id, String name, String password, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.salary = salary;
	}
	public Employee(String name, String password, int age, double salary) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", password="
				+ password + "]";
	}
	
	
}
