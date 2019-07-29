class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("i - "+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("j - "+i);
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=0;k<=20;k++)
		{
			System.out.println("k - "+k);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class threads
{
	public static void main(String args[])
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();

		a1.start();
		b1.start();
		c1.start();


		Thread x1 = Thread.currentThread();
		a1.setName("abc");
		b1.setPriority(6);
		a1.setPriority(2);

		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);

		for(int m=0;m<=30;m++)
		{
			if(m==5)
				b1.suspend();
			if(m==18)
				b1.resume();

			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("m "+m);
		}

		a1.join();
		System.out.println("Done");

	}
}