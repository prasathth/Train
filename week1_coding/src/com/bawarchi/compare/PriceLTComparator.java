package com.bawarchi.compare;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class PriceLTComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish o1, Dish o2) {
		return Double.valueOf(o1.getPrice()).compareTo(o2.getPrice());
	}
	
}
