package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		
	Tractor tractor=new Tractor();
	System.out.println("default Constructor...........");
	System.out.println("tractor.ownerName: "+tractor.ownerName);
	System.out.println("tractor.brand: "+tractor.brand);
	System.out.println("tractor.price: "+tractor.price);
	System.out.println("tractor.color: "+tractor.color);
	System.out.println("tractor.hp: "+tractor.hp);
	System.out.println("tractor.model: "+tractor.model);
	System.out.println(System.lineSeparator());
	
	tractor=new Tractor("khaji");
	System.out.println("*******constructor with one argument************");
	System.out.println("tractor.ownerName: "+tractor.ownerName);
	System.out.println("tractor.brand: "+tractor.brand);
	System.out.println("tractor.price: "+tractor.price);
	System.out.println("tractor.color: "+tractor.color);
	System.out.println("tractor.hp: "+tractor.hp);
	System.out.println("tractor.model: "+tractor.model);
	System.out.println(System.lineSeparator());
	
	tractor=new Tractor("yasmin","eicher");
	System.out.println("*******constructor with two argument************");
	System.out.println("tractor.ownerName: "+tractor.ownerName);
	System.out.println("tractor.brand: "+tractor.brand);
	System.out.println("tractor.price: "+tractor.price);
	System.out.println("tractor.color: "+tractor.color);
	System.out.println("tractor.hp: "+tractor.hp);
	System.out.println("tractor.model: "+tractor.model);
	System.out.println(System.lineSeparator());
	
	tractor=new Tractor("namrata","mahindra",650000);
	System.out.println("*******constructor with three arguments************");
	System.out.println("tractor.ownerName: "+tractor.ownerName);
	System.out.println("tractor.brand: "+tractor.brand);
	System.out.println("tractor.price: "+tractor.price);
	System.out.println("tractor.color: "+tractor.color);
	System.out.println("tractor.hp: "+tractor.hp);
	System.out.println("tractor.model: "+tractor.model);
	System.out.println(System.lineSeparator());
	
	tractor=new Tractor("sujat","powertrac",600000,"red");
	System.out.println("*******constructor with four arguments************");
	System.out.println("tractor.ownerName: "+tractor.ownerName);
	System.out.println("tractor.brand: "+tractor.brand);
	System.out.println("tractor.price: "+tractor.price);
	System.out.println("tractor.color: "+tractor.color);
	System.out.println("tractor.hp: "+tractor.hp);
	System.out.println("tractor.model: "+tractor.model);
	System.out.println(System.lineSeparator());
	
	tractor=new Tractor("numan","Solis",630000,"blue",80);
	System.out.println("*******constructor with five arguments************");
	System.out.println("tractor.ownerName: "+tractor.ownerName);
	System.out.println("tractor.brand: "+tractor.brand);
	System.out.println("tractor.price: "+tractor.price);
	System.out.println("tractor.color: "+tractor.color);
	System.out.println("tractor.hp: "+tractor.hp);
	System.out.println("tractor.model: "+tractor.model);
	System.out.println(System.lineSeparator());
	
	tractor=new Tractor("nadeem","captain",450000,"yellow",75,"captain454");
	System.out.println("*******constructor with six arguments************");
	System.out.println("tractor.ownerName: "+tractor.ownerName);
	System.out.println("tractor.brand: "+tractor.brand);
	System.out.println("tractor.price: "+tractor.price);
	System.out.println("tractor.color: "+tractor.color);
	System.out.println("tractor.hp: "+tractor.hp);
	System.out.println("tractor.model: "+tractor.model);
	
	
	
	
	
	

	}

}
