package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.dao.EmployeeDAO;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApplicationContext ct = new ClassPathXmlApplicationContext("Beans.xml");
    	EmployeeDAO obj = (EmployeeDAO) ct.getBean("emp");
    	
    	String username = request.getParameter("username");
    	int id = Integer.parseInt(request.getParameter("id"));
    	String role = request.getParameter("role");
    	PrintWriter out = response.getWriter();
    	
    	Employee e = new Employee();
    	e.setId(id);
    	e.setRole(role);
    	e.setUsername(username);
    	
    	if(obj.updateEmp(e))
    	{
    		out.println("Success upd");
    	}
    	else
    	{
    		out.println("Failed upd");
    	}
	}

}
