package com.bawarchi.compare;

import java.util.Comparator;

import com.bawarchi.model.Dish;

public class PriceGTcomparator implements Comparator<Dish> {

	@Override
	public int compare(Dish o1, Dish o2) {
		return Double.valueOf(o2.getPrice()).compareTo(o1.getPrice());
	}
	
}
