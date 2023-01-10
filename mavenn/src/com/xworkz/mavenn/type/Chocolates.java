package com.xworkz.mavenn.type;

import org.springframework.stereotype.Component;



@Component
public class Chocolates {
	
	public String color;
	public int price;
	
	public Chocolates() {
	           System.out.println("kitkat is more tastier than other chocolates");
	}
	
	public String flavour(String color,int price) {
		this.color=color;
		this.price=price;
		return color;
	}

}
