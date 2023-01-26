package com.xworkz.server.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 11,urlPatterns = "/methods")
public class SevenMethods extends HttpServlet {
	
	public SevenMethods() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Put method of SevenMethods");
		String data="put the valid answers";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post method of SevenMethods");
		String data="post the card";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Head method of SevenMethods");
		String data="Head of the department";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get method of SevenMethods");
		String data="get cleared the doubts as early as possible";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Options method of SevenMethods");
		String data="dont keep options";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
		
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Trace method of SevenMethods");
		String data="trace the path";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete method of SevenMethods");
		String data="delete the unwanted";
		PrintWriter write=resp.getWriter();
		write.print(data);
		resp.setContentType("text/plain");
		
	}

}
