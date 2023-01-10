package com.xworkz.springs.type;

import org.springframework.stereotype.Component;

@Component
public class Colors {
	
	public String name;
	public int price;
	

	public Colors() {
		// TODO Auto-generated constructor stub
	}
	
	public Colors(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

}
