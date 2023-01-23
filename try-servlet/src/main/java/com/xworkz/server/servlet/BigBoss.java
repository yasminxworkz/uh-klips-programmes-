package com.xworkz.server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/Boss")
public class BigBoss extends HttpServlet {
	
	public BigBoss() {
		System.out.println("Running BigBoss..............");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running doGet method of BigBoss......");
		super.doGet(req, resp);
	}
	

}
