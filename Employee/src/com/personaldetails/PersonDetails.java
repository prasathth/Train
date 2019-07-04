package com.personaldetails;

import com.bank.BankAccount;

public class PersonDetails {
	private int id;
	private String name;
	private double salary;
	private int vacation=7;
	private Address address;
	private BankAccount account;
	
	public PersonDetails(int id,String name,double salary,Address address)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacation() {
		return vacation;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}

	public void applyLeave(int days)
	{
		if(days <= vacation )
		{
			System.out.println("your leave sanctioned");
			vacation -= days;
		}
		else
		{
			System.out.println("Vacation leave low");
		}
	}
}
