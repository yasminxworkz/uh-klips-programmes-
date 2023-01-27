package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/rule")
public class King extends HttpServlet {
	
	public King() {
		System.out.println("Created "+getClass().getSimpleName());
	}
	
	@Override
	public void init() throws ServletException {
      System.out.println("input method started");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("runnig doGet of King");
	String name=req.getParameter("kingName");
	String region=req.getParameter("kingRegion");
	String noOfQueens=req.getParameter("kingwives");
	String DOB=req.getParameter("kingDOB");
	String DOD=req.getParameter("kingDOD");
	
	System.out.println(name);
	System.out.println(region);
	System.out.println(noOfQueens);
	System.out.println(DOB);
	System.out.println(DOD);
	
	PrintWriter write=resp.getWriter();
	write.print("<html>");
	write.print("<body>");
	write.print("<h1>");
	write.print("<span style='color:red'>");
	write.print(" name:"+name);
	write.print("region: "+region);
	write.print("noOfQueens: "+noOfQueens);
	write.print("DOB: "+DOB);
	write.print("DOD: "+DOD);
	write.print("</span>");
	write.print("</h1>");
	write.print("</body>");
	write.print("</html>");
	
	resp.setContentType("text/html");

	}

}
