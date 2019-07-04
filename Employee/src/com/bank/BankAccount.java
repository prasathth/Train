package com.bank;

import com.personaldetails.PersonDetails;

public abstract class BankAccount {
	//public enum ACCOUNT_TYPE{
	//	SAVINGS_ACC,CURRENT_ACC,SAL_ACC;
	///};
	private static int accNum = 1 ;
	private int accNumber;
	//private static final double MIN_ACCOUNT_BALANCE = 10000;
	public PersonDetails person;
	private double balance ;
	//private ACCOUNT_TYPE accType;
	
	public BankAccount(PersonDetails person)
	{
		this.accNumber = accNum++ ;
		this.person = person;
		this.balance = person.getSalary();
		//this.accType = accType;
		this.person.setAccount(this);
	}
	


	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public PersonDetails getPerson() {
		return person;
	}
	
	public void setPerson(PersonDetails person) {
		this.person = person;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract double withdraw(double amountToWithdraw);
	
	public abstract void deposit(double amountTodeposit);
/*
	public void depositAmount(double amountToBeDeposited)
	{
		this.balance = this.balance + amountToBeDeposited ;
	}
	
	public double withdrawAmount(double amountToBeWithdrawed)
	{
		if((this.balance - amountToBeWithdrawed ) >= MIN_ACCOUNT_BALANCE)
		{
			this.balance -= amountToBeWithdrawed;
			return this.balance;
			//System.out.println("Your current balance after withdrawal : "+getSalary());
		}
		else
		{
			System.out.println("Low balance");
			return 0;
			//System.out.println("Your current balance : "+getSalary());
		}
	}
	*/
	public void displayAccDet()
	{
		System.out.println("Your Account Details");
		System.out.println("Acc Number	 "+person.getAccount().getAccNumber());
		System.out.println("Name	"+person.getName());
		//System.out.println("\nType"+accType);
		System.out.println("Balance		"+getBalance());
		System.out.println("Address		"+person.getAddress().getStreet_name()+" "+person.getAddress().getCity());
	}
}
