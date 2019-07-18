package virat.sample;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int vacation=7;
	
	public Employee(int id,String name,double salary)
	{
		this.id = id;
		this.name = name;
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
