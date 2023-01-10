package com.xworkz.springs.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springs.configure.SpringConfigure;
import com.xworkz.springs.type.Colors;

public class ColorsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app= new AnnotationConfigApplicationContext(SpringConfigure.class);
		Colors col=app.getBean(Colors.class);
	   System.out.println(col);
	   String[] x=app.getBeanDefinitionNames();
	   System.out.println(Arrays.toString(x));
	   
	   String s=app.getBean("book",String.class);
	   System.err.println(s);
	   
	   String c=app.getBean("chair",String.class);
	   System.err.println(c);
	   
	   String t=app.getBean("table",String.class);
	   System.err.println(t);
	   
	   String co=app.getBean("color",String.class);
	   System.err.println(co);
	   
	   String p=app.getBean("pen",String.class);
	   System.err.println(p);
	   
	  Double y= app.getBean("noteBook",Double.class);
	  System.out.println(y);
	  
	  Double z= app.getBean("red",Double.class);
	  System.out.println(z);
	  
	  Double w= app.getBean("wheel",Double.class);
	  System.out.println(w);
	  
	  Double v= app.getBean("reynolds",Double.class);
	  System.out.println(v);
	  
	  Double br= app.getBean("wood",Double.class);
	  System.out.println(br);
	  
	  Boolean page=app.getBean("page",Boolean.class);
	  System.out.println(page);
	  
	  Boolean leg=app.getBean("legs",Boolean.class);
	  System.out.println(leg);
	  
	  Boolean vib=app.getBean("vibgyor",Boolean.class);
	  System.out.println(vib);
	   
	  Boolean support=app.getBean("support",Boolean.class);
	  System.out.println(support);
	  
	  Boolean read=app.getBean("read",Boolean.class);
	  System.out.println(read);
	   
	  StringBuffer buff=app.getBean("age",StringBuffer.class);
	  System.out.println(buff);
	  
	  StringBuffer buff1=app.getBean("noOfBottles",StringBuffer.class);
	  System.out.println(buff1);
	  
	  StringBuffer buff2=app.getBean("noOfBus",StringBuffer.class);
	  System.out.println(buff2);
	  
	  StringBuffer buff3=app.getBean("noOfPassengers",StringBuffer.class);
	  System.out.println(buff3);
	  
	  StringBuffer buff4=app.getBean("typeOfTrains",StringBuffer.class);
	  System.out.println(buff4);
	  
	  StringBuilder build1=app.getBean("developer",StringBuilder.class);
	  System.out.println(build1);
	  
	  StringBuilder build2=app.getBean("trainee",StringBuilder.class);
	  System.out.println(build2);
	  
	  StringBuilder build3=app.getBean("nameWith",StringBuilder.class);
	  System.out.println(build3);
	  
	  StringBuilder build4=app.getBean("waterCapacity",StringBuilder.class);
	  System.out.println(build4);
	  
	  StringBuilder build5=app.getBean("institute",StringBuilder.class);
	  System.out.println(build5);
	  
	  Map m=app.getBean("map",Map.class);
	  System.out.println(m);
	  
	  ArrayList al=app.getBean("areas",ArrayList.class);
	  System.out.println(al);
	}

}
