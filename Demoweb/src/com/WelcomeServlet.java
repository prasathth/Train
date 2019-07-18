package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public WelcomeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Unauthorized access to this page");
		out.println("<h3>login <a href='login.html'> here</a></h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("a");
		String pass = request.getParameter("b");
		
		PrintWriter out = response.getWriter();
		
		if(name.equals(pass))
		{
			RequestDispatcher rd = request.getRequestDispatcher("final");
			rd.forward(request, response);
//			out.println("<h3>");
//			out.println("Welcome "+name);
//			out.println("</h3>");
		}
		else
		{
			out.println("<h3>");
			out.println("Invalid");
			out.println("</h3>");
			out.println("<h3>login <a href='login.html'> here</a></h3>");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
