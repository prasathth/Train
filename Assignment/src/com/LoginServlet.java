package com;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		

		
		JavaBean bean = new JavaBean();
		if(bean.loginVerification(username, password))
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
			rd.include(request, response);
		}
		else
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
			rd.include(request, response);
		}
		
		
	}

}
