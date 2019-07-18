package com.bawarchi.model;

import java.util.Comparator;

public class Dish implements Comparator<Dish>{
	private int id;
	public String name;
	private double calories;
	private double price;
	
	public Dish(int id, String name,double pri, double calori)
	{
		this.id = id ;
		this.name = name ;
		this.calories = calori ;
		this.price = pri ;
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


	public double getCalories() {
		return calories;
	}


	public void setCalories(double calories) {
		this.calories = calories;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString()
	{
		return "Dish Id "+this.getId()+"\t\tName "+this.getName()+
				"\t\tPrice "+this.getPrice()+"\t\tCalories "+this.getCalories()+"\n";
	}
}
