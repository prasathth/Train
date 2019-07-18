package com.pack.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String args[]) throws Exception
	{
		ApplicationContext ct = new ClassPathXmlApplicationContext("Roles.xml");
		
		Object obj1 = ct.getBean("manager");
		Object obj2 = ct.getBean("manager");
		Object obj3 = ct.getBean("manager");
		((Manager)obj2).setName("dravid");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		obj2 = null ;
		System.gc();
		Thread.sleep(2000000);
	}
}
