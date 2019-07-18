package com;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserRegis() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("new_user_name");
		String password = request.getParameter("new_password");
		String age = request.getParameter("age");
		int a = Integer.parseInt(age);
		String n = request.getParameter("mobile_number");
		int no = Integer.parseInt(n);
		//String pass=request.getParameter("new_confirm_password");
		
		JavaBean bean = new JavaBean();
			
		if(bean.userregis(username, password,a,no))
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("signupsuccess.jsp");
			rd.include(request, response);
		}
		else
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("signupfail.jsp");
			rd.include(request, response);
		}
		
		
	}

}
