package com.myservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Myservlet extends HttpServlet
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter out = response.getWriter();
		System.out.print("In servlet----2");
		
		HttpSession session=request.getSession(false);
		System.out.println("in servlet-2 session id"+session.getId());
		String name=(String) session.getAttribute("username");
		System.out.println("username in session is..."+name);
		
		
		RequestDispatcher rd= request.getRequestDispatcher("/Home.html");
		rd.forward(request, response);
		
	}

}
