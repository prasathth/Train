/*class Abc implements Runnable{
	synchronized public void run()
	{
		for(int y=0;y<=10;y++)
		{
			System.out.println(Thread.currentThread().getName()+" i "+y);
			try
			{
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class Conc
{
	public static void main(String args[])
	{
		Abc a = new Abc();

		Thread t = new Thread(a);
		Thread tt = new Thread(a);

		t.start();
		tt.start();
	}
}*/
import java.util.concurrent.locks.*;
import java.util.concurrent.*;

class Abc implements Runnable{

	ReentrantLock rlock = new ReentrantLock();

	public void run()
	{
		try
		{
			if(rlock.tryLock(3,TimeUnit.SECONDS))
			{	
				for(int y=0;y<=10;y++)
				{
					System.out.println(Thread.currentThread().getName()+" i "+y);
					try
					{
						Thread.sleep(200);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				rlock.unlock();
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" cannot wait ");
			}		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}

public class Conc
{
	public static void main(String args[])
	{
		Abc a = new Abc();

		Thread t = new Thread(a);
		Thread tt = new Thread(a);

		t.start();
		tt.start();
	}
}