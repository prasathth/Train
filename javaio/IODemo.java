import java.io.*;

public class IODemo
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter file name ");
			String fname = b.readLine();
			
			File f = new File(fname);
			if(f.exists())
			{
				BufferedReader fr = new BufferedReader(new FileReader(fname));
				String l="";
				while((l=fr.readLine())!=null)
					System.out.println(l);
				fr.close();
			}
			else
			{
				System.out.println("wrong");
			}
			b.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}