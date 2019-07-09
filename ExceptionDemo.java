import java.util.*;
import java.io.*;
class A
{
	public void abc()throws IOException
	{
		int a=50;
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			int res = a/(a-i);
			if(i==10)
				throw new IOException();
			if(i==46)
				throw new userExcep("i will be 4");
		}
	}
	public void ccc() throws IOException
	{
		abc();
	}
}

class userExcep extends RuntimeException
{
	public userExcep()
	{
	}
	public userExcep(String a)
	{
		super(a);
	}
}
public class ExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			A a1 = new A();
			a1.ccc();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(userExcep e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("main block");
		
	}
}