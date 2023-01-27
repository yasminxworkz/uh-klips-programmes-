package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/work")
public class Employee extends HttpServlet {

	public Employee() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet of Employee");
	String name=req.getParameter("Name");
	String age=req.getParameter("Age");
	String gender=req.getParameter("Gender");
	String jobType=req.getParameter("JobType");
	String job=req.getParameter("Job");
	String salary=req.getParameter("Salary");
	String maritalStatus=req.getParameter("MaritalStatus");
	String height=req.getParameter("Height");
	String weight=req.getParameter("Weight");
	String contact=req.getParameter("Contact");
	String city=req.getParameter("City");
	String emailId=req.getParameter("EmailId");
	String recruitedDate=req.getParameter("RecruitedDate");
	String noOfChildrens=req.getParameter("NoOfChildrens");
	String qualification=req.getParameter("Qualification");
	String location=req.getParameter("Location");
	String experience=req.getParameter("Experience");
	String religion=req.getParameter("Religion");
	String nationality=req.getParameter("Nationality");
	String DOB=req.getParameter("DOB");
	
	System.out.println(name);
	System.out.println(age);
	System.out.println(gender);
	System.out.println(jobType);
	System.out.println(job);
	System.out.println(salary);
	System.out.println(maritalStatus);
	System.out.println(height);
	System.out.println(weight);
	System.out.println(contact);
	System.out.println(city);
	System.out.println(emailId);
	System.out.println(recruitedDate);
	System.out.println(noOfChildrens);
	System.out.println(qualification);
	System.out.println(location);
	System.out.println(experience);
	System.out.println(religion);
	System.out.println(nationality);
	System.out.println(DOB);
	
	PrintWriter write=resp.getWriter();
	write.print("<html>");
	write.print("<body>");
	write.print("<h1>");
	write.print("<span style='color:green'>");
	write.print(name);
	write.print(age);
	write.print(gender);
	write.print(jobType);
	write.print(job);
	write.print(salary);
	write.print(maritalStatus);
	write.print(height);
	write.print(weight);
	write.print(contact);
	write.print(city);
	write.print(emailId);
	write.print(recruitedDate);
	write.print(noOfChildrens);
	write.print(qualification);
	write.print(location);
	write.print(experience);
	write.print(religion);
	write.print(nationality);
	write.print(DOB);
	write.print("</span>");
	write.print("</h1>");
	write.print("</body>");
	write.print("</html>");
	resp.setContentType("text/html");

	
	
	}
}
