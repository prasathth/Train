package com.pack.lombokdemo;

import lombok.NonNull;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Emp ob1 = new Emp("Sachin",5,20000,"worker");
        ob1=null;
        App.display(ob1);
        //ob1.setAge(15);
        //ob1.setName("Sachin");
        //ob1.setAge(10);
        //ob1.setSalary(30000);
        //ob1.setDesignation("manager");
        //Emp ob3 = new Emp("Sachin",5,20000,"worker");
        //System.out.println(ob1);
        //System.out.println(ob3);
        //System.out.println(ob3.equals(ob1));
    }
    public static void display(@NonNull Emp a)
    {
    	System.out.println(a);
    }
}
