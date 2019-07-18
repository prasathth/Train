package virat.sample;

public class Client {

	public static void main(String args[])
	{
		Employee kumar = new Employee(1,"Kumar",15000);
		
		System.out.println("Vacation initial : "+kumar.getVacation());
		kumar.applyLeave(7);
		System.out.println("Vacation now : "+kumar.getVacation());
	}
}
