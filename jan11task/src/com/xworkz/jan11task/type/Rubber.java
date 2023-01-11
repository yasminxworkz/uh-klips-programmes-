package com.xworkz.jan11task.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("eraser")
	private String name;
	@Autowired
	@Qualifier("eType")
	private String type;
	@Autowired
	@Qualifier("ePrice")
	private double price;
	@Autowired
	@Qualifier("eColor")
	private String color;
	@Autowired
	private String shape;
	@Autowired
	private double size;
	@Autowired
	@Qualifier("eStolen")
	private boolean stolen;
	
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", size=" + size + ", stolen=" + stolen + "]";
	}

}
