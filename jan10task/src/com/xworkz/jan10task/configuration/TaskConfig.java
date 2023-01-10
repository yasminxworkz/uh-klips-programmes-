package com.xworkz.jan10task.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.jan10task.component.Actor;
import com.xworkz.jan10task.component.Rocket;

@Configuration
@ComponentScan("com.xworkz.jan10task")
public class TaskConfig {
	
	@Bean
	public Rocket rock() {
		Rocket r=new Rocket();
		return r;
	}
	
	@Bean
	public Actor bollywood() {
		Actor act=new Actor("SharukhKhan", "Hindi", 50);
		return act;
	}

}
