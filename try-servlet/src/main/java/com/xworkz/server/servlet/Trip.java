package com.xworkz.server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8,urlPatterns = "/Trip")
public class Trip extends HttpServlet{
	
	public Trip() {
		System.out.println("Running Trip............");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method in Trip......");
		super.doGet(req, resp);
	}

}
