package com.xworkz.jan10task.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	//const
	private String name;
	private String language; 
	private int age;
	
	
	public Actor(@Value("SalmanKhan")String name, @Value("Hindi")String language, @Value("55")int age) {
		this.name = name;
		this.language = language;
		this.age = age;
		System.out.println("parameterized const of actor");
	}


	public String getName() {
		return name;
	}


	public String getLanguage() {
		return language;
	}


	public int getAge() {
		return age;
	}
	

}
