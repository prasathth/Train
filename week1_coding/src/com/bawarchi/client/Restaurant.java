package com.bawarchi.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bawarchi.compare.CaloriesGTComparator;
import com.bawarchi.compare.CaloriesLTcomparator;
import com.bawarchi.compare.PriceGTcomparator;
import com.bawarchi.compare.PriceLTComparator;
import com.bawarchi.model.Dish;

public class Restaurant {
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<Dish> FoodItems = new ArrayList<>();
		
		Dish Item1 = new Dish(1,"Dosa",50,300);
		Dish Item2 = new Dish(2,"Idli-vada",40,200);
		Dish Item3 = new Dish(3,"Pulav",80,330);
		Dish Item4 = new Dish(4,"Roti-curry",100,250);
		Dish Item5 = new Dish(5,"Neer-Dosa",50,100);
		
		FoodItems.add(Item1);
		FoodItems.add(Item2);
		FoodItems.add(Item3);
		FoodItems.add(Item4);
		FoodItems.add(Item5);
		
		System.out.println("========Welcome=======\n"
				+ "1 sort the dishes in the increasing order of calories\n"
				+ "2 sort the dishes in the decreasing order of calories\n"
				+ "3 sort the dishes in the increasing order of price\n"
				+ "4 sort the dishes in the decreasing order of price");
		int choice = sc.nextInt();
		//sc.nextLine();
		
		switch(choice)
		{
		case 1 : Collections.sort(FoodItems, new CaloriesLTcomparator());
				System.out.println(FoodItems);
				break ;
		case 2 :Collections.sort(FoodItems, new CaloriesGTComparator());
		System.out.println(FoodItems);
		         break ;
		case 3 :Collections.sort(FoodItems, new PriceLTComparator());
		System.out.println(FoodItems);
		       break ;
		case 4 : Collections.sort(FoodItems, new PriceGTcomparator());
		System.out.println(FoodItems);
               break;
         default: System.out.println("Please Enter valid option");
		}
		
		System.out.println("============Enter item id=========\n");
		int orderid = sc.nextInt();
		double amount=0;
		String dish = "";
		for(Dish items : FoodItems )
		{
			if(items.getId() == orderid)
			{
				amount = items.getPrice() ;
				dish = items.getName() ;
				break;
			}
		}
		
		System.out.println("-----You have ordered "+dish+" and your bill amount is "+amount+"------");
		
		double useramt = sc.nextDouble();
		
		if(amount == useramt)
			System.out.println("-----Thank You for your order------");
		else if(amount < useramt)
		{
			System.out.println("---Thank You for your order and collect change Rs."+(useramt-amount)+"----");
		}
		else
			System.out.print("Amount is less than bill amount");
		sc.close();
	}
}
