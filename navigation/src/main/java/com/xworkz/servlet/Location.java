package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/place")
public class Location extends HttpServlet {
	
	public Location() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in location");
		String name=req.getParameter("name");
		String emailId=req.getParameter("emailId");
		String startPoint=req.getParameter("started");
		String destination=req.getParameter("ended");
		String gender=req.getParameter("gender");
		
		System.out.println("name :"+name);
		System.out.println("name :"+emailId);
		System.out.println("name :"+startPoint);
		System.out.println("destination :"+destination);
		System.out.println("gender :"+gender);
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span>");
		if(name.length()>3) {
			
		}
		else {
			writer.print("<span style='color:Red'>");
			writer.print("length of the name is less than 3 Go to home page and fill properly once again");
			writer.print("<br>");
			writer.print("<br>");
			writer.print("<a href=index.html>Home</a>");
			writer.print("</span>");
		}
		
		
		
		if(startPoint.length()>3) {
			
		}
		else {
			writer.print("<span style='color:Red'>");
			writer.print("length of the startPoint is less than 3  Go to home page and fill properly once again");
			writer.print("<br>");
			writer.print("<br>");
			writer.print("<a href=index.html>Home</a>");
			writer.print("</span>");
		}
		
		if(destination.length()>3) {
			
		}
		else {
			writer.print("<span style='color:Red'>");
			writer.print("length of the destination name exceeded Go to home page and fill properly once again");
			writer.print("<br>");
			writer.print("<br>");
			writer.print("<a href=index.html>Home</a>");
			writer.print("</span>");
		}
		
		
		
		writer.print("<br>");
		
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
	
		

	}
	
	

}
