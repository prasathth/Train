package com;
import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "Sapient123");
			Statement smt = con.createStatement();
			//smt.executeUpdate("insert into emp values('virat kohli',25)");
			ResultSet rs = smt.executeQuery("select * from user_info");
			while(rs.next())
			{
				System.out.println("your name :"+rs.getString(1));
				System.out.println("your age :"+rs.getInt("age"));
				
			}
			rs.close();
			smt.close();
			//con.close();
			//PreparedStatement ps = con.prepareStatement("insert into emp values(?,?)");
			//String name = sc.nextLine();
			//int age = sc.nextInt();
			//ps.setString(1, name);
			//ps.setInt(2, age);
			//ps.execute();
			
			//ps.close();
			con.close();
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
