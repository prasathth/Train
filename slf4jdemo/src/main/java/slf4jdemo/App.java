package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static Logger log = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		log.info("hello world");
		
		int a = add(3,2);
		System.out.println("hello world"+a);
	}
	
	public static int add(int x , int y)
	{
		return x+y;
	}
}
