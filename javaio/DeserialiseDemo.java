import java.io.*;

public class DeserialiseDemo
{
	public static void main(String[] args) {
		try {
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
			Person p = (Person) ois.readObject();
			ois.close();
			System.out.println("Always"+p.name);
			System.out.println("Age"+p.age);
			System.out.println("DeSerialize sucess");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}