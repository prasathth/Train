package virat.sample;
enum accountType{
	SAVINGS_ACC,CURRENT_ACC,SAL_ACC;
}
public class BankAcc {
	private double salary;
	private int id ;
	private String name ;
	private static int accNum = 0 ;
	private static final double MIN_ACCOUNT_BALANCE = 10000;
	Address address;
	private AccType
	public BankAcc(double salary,String name,Address address)
	{
		this.id = accNum++ ;
		this.salary = salary;
		this.name = name;
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	public void displayAddress()
	{
		System.out.println(accNum+"Address : "+address.getStreet_name()+" "+address.getCity());
	}

	public void depositAmount(double amountToBeDeposited)
	{
		this.salary = this.salary + amountToBeDeposited ;
	}
	
	public double checkBalance()
	{
		return salary;
	}
	
	public double withdrawAmount(double amountToBeWithdrawed)
	{
		if((salary - amountToBeWithdrawed ) >= MIN_ACCOUNT_BALANCE)
		{
			salary -= amountToBeWithdrawed;
			return salary;
			//System.out.println("Your current balance after withdrawal : "+getSalary());
		}
		else
		{
			System.out.println("Low balance");
			return 0;
			//System.out.println("Your current balance : "+getSalary());
		}
	}
}
