package com.pack.spring;

public class Women implements Human {
	private String name;
	private int age;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	@Override
	public String toString() {
		System.out.println("Women [name=" + name + ", age=" + age + "]");
		System.out.println(address);
		return "";
	}
}
