package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/call")
public class Contact extends HttpServlet {
	
	public Contact() {
		System.out.println(" created "+getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost method of contact");
		
		String name=req.getParameter("name");
		String email=req.getParameter("emailId");
		String mobile=req.getParameter("phone");
		String comment=req.getParameter("comment");
		
		System.out.println("name : "+name);
		System.out.println("email :"+email);
		System.out.println("mobile :"+mobile);
		System.out.println("comment :"+comment);

		PrintWriter writer=resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		
		if(name.length()>3) {
			
		}
		else {
			writer.print("<span style='color:Red'>");
			writer.print("length of the name exceeded Go to home page and fill properly once again");
			writer.print("<br>");
			writer.print("<br>");
			writer.print("<a href=index.html>Home</a>");
			writer.print("</span>");
		}
		
		
		
		if(mobile.length()>3) {
			
		}
		else {
			writer.print("<span style='color:Red'>");
			writer.print("length of the mobile number exceeded Go to home page and fill properly once again");
			writer.print("<br>");
			writer.print("<br>");
			writer.print("<a href=index.html>Home</a>");
			writer.print("</span>");
		}
		
		if(comment.length()>3) {
			
		}
		else {
			writer.print("<span style='color:Red'>");
			writer.print("length of the comment exceeded Go to home page and fill properly once again");
			writer.print("<br>");
			writer.print("<br>");
			writer.print("<a href=index.html>Home</a>");
			writer.print("</span>");
		}
		
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}

}
