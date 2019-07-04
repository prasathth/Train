package com.bank;

import com.personaldetails.PersonDetails;

public class CurrentAccount extends BankAccount {

	private final double MIN_CURRENT_BAL = 25000;

	private double balance;
	
	public CurrentAccount(PersonDetails person)
	{
		super(person);
	}
	
	public double withdraw(double amountToWithdraw)
	{
		if((person.getAccount().getBalance()-amountToWithdraw) >= MIN_CURRENT_BAL)
		{
			balance = person.getAccount().getBalance() - amountToWithdraw ;
			person.getAccount().setBalance(balance);
			return amountToWithdraw;
		}
		else
			return 0;
	}
	
	public void deposit(double amountToDeposit)
	{
		balance = person.getAccount().getBalance() + amountToDeposit ;
		person.getAccount().setBalance(balance);
		System.out.println("Deposit done");
		//return balance;
	}
}
