package com.xworkz.jan12task.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.jan12task.component.Engine;
import com.xworkz.jan12task.component.Ghost;
import com.xworkz.jan12task.component.NewsPaper;
import com.xworkz.jan12task.component.Snake;
import com.xworkz.jan12task.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
     
		System.out.println(Arrays.toString( container.getBeanDefinitionNames()));
		
		
		Engine run=container.getBean(Engine.class);
		System.err.println("Details of engine");
	        System.out.println(run.getStrokes());
	        System.out.println(run);
	        
	        
	    	System.err.println("Details of snake");
	        Snake s=container.getBean(Snake.class);
	        System.out.println(s);
	        
	        NewsPaper news=container.getBean("newsPaper",NewsPaper.class);
	    	System.err.println("Details of newspaper");
	        System.out.println(news);
	        System.out.println(news.getPrice());
	        
	        Ghost ghost=container.getBean(Ghost.class);
	       System.err.println("Details of ghost");
	        System.out.println(ghost);
	}

}
