package com.pouchen.roy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public HelloWorld() {
		
	}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.getWriter().append("Maven Get....");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse res) throws IOException {
		doGet(request, res);
	}
	
}
