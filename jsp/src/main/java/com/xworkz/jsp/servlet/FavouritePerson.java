package com.xworkz.jsp.servlet;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup =1, urlPatterns = "/favourite")
public class FavouritePerson extends HttpServlet {
	
	public FavouritePerson() {
		System.out.println("Running Favourite person");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running doPost of Favourite person");
	String firstName=req.getParameter("fname");
	String lastName=req.getParameter("lname");
	String gender=req.getParameter("gen");
	String reason=req.getParameter("reas");
	String address=req.getParameter("add");
	
	System.out.println(firstName);
	System.out.println(lastName);
	System.out.println(gender);
	System.out.println(reason);
	System.out.println(address);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("FavouritePerson.jsp");
	req.setAttribute("fName", firstName);
	req.setAttribute("lName", lastName);
	req.setAttribute("gender", gender);
	req.setAttribute("reason", reason);
	req.setAttribute("address", address);
	req.setAttribute("msg", "successfully.....submitted.....");
	
	dispatcher.forward(req, resp);
	
	}

}
