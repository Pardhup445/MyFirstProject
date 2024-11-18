package com.Tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {

	 private PrintWriter pw;
	 
	  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  pw=resp.getWriter();
		  pw.println("Hello");
		  pw.println("IAm Pamuru");
		  System.out.println("Hello Iam Pamuru");
		  
		  resp.sendRedirect("secind.html");
	}
}
