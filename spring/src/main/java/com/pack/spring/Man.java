package com.pack.spring;

public class Man implements Human {
private String name;
private int age;
private Address address ;
public Man(String name, int age , Address address) {
	super();
	this.name = name;
	this.age = age;
	this.address = address ;
}

@Override
public String toString() {
	System.out.println( "Man [name=" + name + ", age=" + age + "]");
	System.out.println(address);
	return "";
}
}
