package com.xworkz.jan10task.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	//literal
	
	@Value("India")
	private String country;
	@Value("PSLV")
	private String name;
	@Value("200D")
	private double budget;
	
	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBudget() {
		return budget;
	}

}
