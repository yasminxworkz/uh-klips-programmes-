package com.xworkz.springs.boot;

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
	   
	   Spring s=app.getBean("book",Spring.class);
	   System.out.println(s);
	   
	   
	   
	}

}
