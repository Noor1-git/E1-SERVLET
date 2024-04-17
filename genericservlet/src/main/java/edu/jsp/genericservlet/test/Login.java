package edu.jsp.genericservlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("username");
		String email = req.getParameter("useremail");
		String password = req.getParameter("userpassword");

		PrintWriter writer=res.getWriter();
		
		writer.write("<html><body><h1>Name : "+name+"<br>"
				+ "Email : "+email+"<br>"
				+ "Password : "+password+"</h1></body></html>");
	}
}