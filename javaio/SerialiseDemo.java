import java.io.*;

public class SerialiseDemo
{
	public static void main(String[] args) {
		try {
			Person p1 = new Person();
			p1.name = "Dhoni";
			p1.age=35;
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
			oos.writeObject(p1);
			oos.close();
			System.out.println("Serialize sucess");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}