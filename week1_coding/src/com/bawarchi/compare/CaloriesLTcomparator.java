package com.bawarchi.compare;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class CaloriesLTcomparator implements Comparator<Dish> {

	@Override
	public int compare(Dish o1, Dish o2) {
		return Double.valueOf(o1.getCalories()).compareTo(o2.getCalories());
	}
	
}
