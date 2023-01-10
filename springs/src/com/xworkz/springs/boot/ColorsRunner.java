package com.xworkz.springs.boot;

import java.util.Arrays;

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
	   System.out.println(s);
	  Double y= app.getBean("note",Double.class);
	  System.out.println(y);
	   
	   
	   
	}

}
