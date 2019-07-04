package india;

import java.util.Scanner;

import com.bank.BankAccount;
import com.bank.CurrentAccount;
import com.bank.SalaryAccount;
import com.bank.SavingsAccount;
import com.personaldetails.Address;
import com.personaldetails.PersonDetails;


public class AccountUser {
	Scanner sc = new Scanner(System.in);
	
	public void banking(BankAccount acc)
	{
		int c;
		do
		{
			System.out.println("Welcome to banking\n1.Deposit\n2.Withdrawal\n3.Balance\n4.Account Details\n5.Exit ");
			c = sc.nextInt();
		
			switch(c)
			{
				case 1: System.out.println("Enter amount to deposit ");
						double amountToDeposit = sc.nextDouble();
						acc.deposit(amountToDeposit);
						break;
				case 2: System.out.println("Enter amount to withdraw ");
						double amountToWithdraw = sc.nextDouble();
						acc.withdraw(amountToWithdraw);
						break;
				case 3: System.out.println("Your balance "+acc.getBalance());
						break;
				case 4: acc.displayAccDet();
						break;
				case 5: break;
				default : System.out.println("sfesf");
			}
		}while(c != 5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountUser user = new AccountUser();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your name ");
		String name = sc.nextLine();
		
		System.out.println("Enter Your Employye id ");
		int empId = sc.nextInt();
		
		System.out.println("Enter Your salary ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Your Street name ");
		String streett = sc.nextLine();
		String street = sc.nextLine();
		
		System.out.println("Enter Your city name ");
		String city = sc.nextLine();
		
		Address address1 = new Address(street,city);
		PersonDetails person1 = new PersonDetails(empId,name,salary,address1);
		
		System.out.println("Enter the type of account\n1.Savings\n2.Current\n3.Salary ");
		int type = sc.nextInt();
		BankAccount savingsAcc;
		BankAccount currentAcc;
		BankAccount salaryAcc;
		
		switch(type)
		{
		case 1 : if(salary >= SavingsAccount.getMinSavingsBal())
				 {
					savingsAcc = new SavingsAccount(person1);
					user.banking(savingsAcc);
				 }
			else
			{
				System.out.println("Minimum Balance should be 10000");
			}
				break;
		case 2: currentAcc = new CurrentAccount(person1);
				user.banking(currentAcc);
				break;
		case 3: salaryAcc = new SalaryAccount(person1);
				user.banking(salaryAcc);
				break;
		default: System.out.println("wrong value");
		}
		
	}
}
