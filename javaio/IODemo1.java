import java.io.*;

public class IODemo1
{
	public static void main(String[] args) 
	{
		try
		{
			RandomAccessFile a = new RandomAccessFile("file.txt","rw");
			//System.out.println(a.readLine());
			a.seek(a.length());
			a.writeBytes("dhoni");
			a.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}