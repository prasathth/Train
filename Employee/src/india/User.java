package india;

import java.util.Scanner;

import com.bank.BankAccount;
import com.personaldetails.Address;
import com.personaldetails.PersonDetails;

public class User {

	public static void main(String args[])
	{
		//Address address1 = new Address("hi street","chennai");
		//PersonDetails kumar = new PersonDetails(1,"Kumar",15000,address1);
		//BankAccount user1 = new BankAccount(kumar,BankAccount.ACCOUNT_TYPE.SAVINGS_ACC);
		
		Scanner sc = new Scanner(System.in);
		//System.out.println(kumar.getAccount().getBalance());
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
		//BankAccount acc1 = new BankAccount(person1,BankAccount.ACCOUNT_TYPE.SAVINGS_ACC);
		BankAccount acc1 = new BankAccount(person1);
		System.out.println("Your account is created and your account number is "+person1.getAccount().getAccNumber());
		
		System.out.println("Welcome to banking\n1.Deposit\n2.Withdrawal\n3.Balance\n4.Account Details\n5.Exit ");
		int c;
		do
		{
			System.out.println("Welcome to banking\n1.Deposit\n2.Withdrawal\n3.Balance\n4.Account Details\n5.Exit ");
						c = sc.nextInt();
		
			switch(c)
			{
				case 1: System.out.println("Enter amount to deposit ");
						double amountToDeposit = sc.nextDouble();
						person1.getAccount().deposit(amountToDeposit);
						break;
				case 2: System.out.println("Enter amount to withdraw ");
						double amountToWithdraw = sc.nextDouble();
						person1.getAccount().withdraw(amountToWithdraw);
						break;
				case 3: System.out.println("Your balance "+person1.getAccount().getBalance());
						break;
				case 4: person1.getAccount().displayAccDet();
						break;
				case 5: break;
				default : System.out.println("sfesf");
			}
		}while(c != 5);
		sc.close();
	}
}
