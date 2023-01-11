package com.xworkz.jan10task.boot;


import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.jan10task.component.Actor;
import com.xworkz.jan10task.component.Rocket;
import com.xworkz.jan10task.component.Season;
import com.xworkz.jan10task.configuration.TaskConfig;

public class TaskRunner {

	public static void main(String[] args) {
		ApplicationContext a=new AnnotationConfigApplicationContext(TaskConfig.class);
        
        String[] arr=a.getBeanDefinitionNames();
        System.out.println(Arrays.toString(arr));
        
        Season s=a.getBean(Season.class);
        System.out.println(s.getName());
        System.out.println(s.getStartingMonth());
        System.out.println(s.getDuration());
        
        Rocket r=a.getBean("rock",Rocket.class);
        System.err.println(r.getCountry());
        System.err.println(r.getName());
        System.err.println(r.getBudget());
        
        Rocket ra=a.getBean("rocket",Rocket.class);
        System.err.println(ra.getCountry());
        System.err.println(ra.getName());
        System.err.println(ra.getBudget());
        
        Actor ac=a.getBean("bollywood",Actor.class);
        System.out.println(ac.getName());
        System.out.println(ac.getAge());
        System.out.println(ac.getLanguage());
        
        Actor ab=a.getBean("actor",Actor.class);
        System.out.println(ab.getName());
        System.out.println(ab.getAge());
        System.out.println(ab.getLanguage());
//        String[] x=a.getBeanDefinitionNames();
// 	   System.out.println(Arrays.toString(x));
	}

}
