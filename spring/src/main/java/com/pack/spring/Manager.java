package com.pack.spring;

public class Manager {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Manager [name=" + name + "]";
}

public void abc()
{
	System.out.println("object created");
}
public void xyq()
{
	System.out.println("object delete");
}
}
