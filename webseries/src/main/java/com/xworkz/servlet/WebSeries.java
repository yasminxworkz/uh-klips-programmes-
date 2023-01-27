package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/TV")
public class WebSeries extends HttpServlet {
	
	public WebSeries() {
		System.out.println("created "+getClass().getSimpleName());
	}
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ruuning doGet of Webseries");
		String name=req.getParameter("Name");
		String lang=req.getParameter("Language");
		String episode=req.getParameter("Episodes");
		String ott=req.getParameter("Ott");
		String budget=req.getParameter("Budget");
		
		System.out.println(name);
		System.out.println(lang);
		System.out.println(episode);
		System.out.println(ott);
		System.out.println(budget);
		
		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		write.print("<span>");
		write.print(name);
		write.print(lang);
		write.print(episode);
		write.print(ott);
		write.print(budget);
		write.print("</span>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}
	

}
