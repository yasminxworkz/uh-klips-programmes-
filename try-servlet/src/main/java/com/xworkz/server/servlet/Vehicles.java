package com.xworkz.server.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9,urlPatterns = "/vehicles")
public class Vehicles extends HttpServlet {
	
	public Vehicles() {
		System.out.println("Running Vehicles..........");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method in Vehicles............");
		super.doGet(req, resp);
	}

}
