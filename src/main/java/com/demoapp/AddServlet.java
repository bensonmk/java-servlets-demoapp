package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	// the parameter objects will be created by tomcat, we just have to use the refs only
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		
//		// printing data on response object
//		PrintWriter out = res.getWriter();
//		
//		out.println("result is "	+ k);
//	}
	
	// accept post request only/ for post reequests
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		
//		// printing data on response object
//		PrintWriter out = res.getWriter();
//		
//		out.println("result is "	+ k);
//	}
	
	// for get requests
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;		

		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
	}
}
