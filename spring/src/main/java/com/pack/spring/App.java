package com.pack.spring;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Human obj = new Man(); //obj.setName("DK"); //obj.setAge(10);
		 * System.out.println( obj );
		 */
        //Resource resource = new ClassPathResource("beans.xml");
    	//BeanFactory fac = new XmlBeanFactory(resource);
    	//BeanFactory fac = new ClassPathXmlApplicationContext("beans.xml");
    	ApplicationContext fac = new ClassPathXmlApplicationContext("beans.xml");
    	Scanner sc = new Scanner(System.in);
    	
    	
    	String x = sc.nextLine();
    	if(x.equals("Man") || x.equals("Women"))
    	{
    		Human obj = (Human) fac.getBean(x);
    		System.out.println(obj);
    	}
    	
    	Address address = (Address) fac.getBean("m_addre");
    	System.out.println(address);
    }
}
