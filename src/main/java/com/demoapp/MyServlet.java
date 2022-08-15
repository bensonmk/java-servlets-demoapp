package com.demoapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
//		ServletContext cfg = getServletContext(); 
//		same for all servlets
		ServletConfig cfg = getServletConfig();
//		diff for all servlets
		String str = cfg.getInitParameter("name");
		out.print(str);
	}
}
