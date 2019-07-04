package com.bank;

import com.personaldetails.PersonDetails;

public class SalaryAccount extends BankAccount {
	
	private final double MIN_SAVINGS_BAL = 0;
	private final double MAX_DEPOSIT = 50000;
	private double balance;
	
	public SalaryAccount(PersonDetails person)
	{
		super(person);
	}
	
	public double withdraw(double amountToWithdraw)
	{
		if((person.getAccount().getBalance()-amountToWithdraw) >= MIN_SAVINGS_BAL)
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
		if(amountToDeposit <= MAX_DEPOSIT)
		{
			balance = person.getAccount().getBalance() + amountToDeposit ;
			person.getAccount().setBalance(balance);
			System.out.println("Deposit done");
			//return balance;
		}
		else
			System.out.println("Deposit limit crossed");
	}

}
