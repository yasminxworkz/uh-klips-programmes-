package com.xworkz.jan11task.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.jan11task.configuration.SpringConfiguration;
import com.xworkz.jan11task.type.HardwareShop;
import com.xworkz.jan11task.type.Human;
import com.xworkz.jan11task.type.Pencil;
import com.xworkz.jan11task.type.Rubber;
import com.xworkz.jan11task.type.Software;
import com.xworkz.jan11task.type.SoftwareEngineer;

public class TaskRunner {

	public static void main(String[] args) {
		ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	    System.out.println(Arrays.toString(app.getBeanDefinitionNames()));
	   
	    System.err.println(" data of HardwareShop");
	    HardwareShop tools=app.getBean(HardwareShop.class);
	    System.out.println(tools);
	   
	    System.err.println(" data of Pencil");
	    Pencil pen=app.getBean(Pencil.class);
	    System.out.println(pen);
	   
	    System.err.println(" data of Rubber");
	    Rubber r=app.getBean(Rubber.class);
	    System.out.println(r);
	
	    System.err.println(" data of software");
	    Software soft=app.getBean(Software.class);
	    System.out.println(soft);
	    
	    System.err.println(" data of softwareengineer");
	    SoftwareEngineer code=app.getBean(SoftwareEngineer.class);
	    System.out.println(code);
	    
	    System.err.println(" data of Human");
	    Human h=app.getBean(Human.class);
	    System.out.println(h);
	
	}
}
