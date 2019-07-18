import java.io.*;
public class IODemo2
{
	public static void main(String[] args) 
	{
		try
		{
			//PrintWriter p = new PrintWriter(System.out);
			//PrintWriter p = new PrintWriter(new FileOutputStream("file.txt",true));
			//p.print("INDIA");
			//p.flush();
			File x = new File("IO programs");
			x.mkdir();
			File y = new File(x,"hijk");
			y.mkdir();
			File z = new File(y,"a.txt");
			z.createNewFile();
			PrintWriter p = new PrintWriter(new FileOutputStream(z,true));
			p.println("INDIA");
			p.flush();
			p.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}