package virat.sample;




public class BankClient {

	public static void main(String args[])
	{
		Address address = new Address("ab","ww");
		BankAcc ram = new BankAcc(30000,"ram",address,BankAcc.accountType.SAVINGS_ACC);
		ram.displayAddress();		
		System.out.println("Start Balance : "+ram.getSalary());
		ram.withdrawAmount(1000);
		System.out.println("Balance after withdraw 1000 : "+ram.getSalary());
	}
}
