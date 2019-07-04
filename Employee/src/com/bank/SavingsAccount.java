package com.bank;

import com.personaldetails.PersonDetails;

public class SavingsAccount extends BankAccount{
	
	private final static double MIN_SAVINGS_BAL = 10000;
	private final double MAX_DEPOSIT = 50000;
	private double balance;
	public SavingsAccount(PersonDetails person)
	{
		super(person);
	}
	
	public double withdraw(double amountToWithdraw)
	{
		if((person.getAccount().getBalance()-amountToWithdraw) >= getMinSavingsBal())
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

	public static double getMinSavingsBal() {
		return MIN_SAVINGS_BAL;
	}

}
