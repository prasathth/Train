package com;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class configdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String name="Hitman";
    
    public configdemo() {
        super();
    }

	
	public void init(ServletConfig config) throws ServletException {
	name = config.getInitParameter("user");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("</h3>hi "+name+"</h3>");
		ServletContext sc = request.getServletContext();
		String colg = sc.getInitParameter("college");
		response.getWriter().println("</h3>College "+colg+"</h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
