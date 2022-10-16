package com.xworkz.taskToday.constructor;



public class Tractor {
	public String ownerName;
	public String brand;
	public int price;
	public String color;
	public int hp;
	public String model;
	
	
	public Tractor() {
		
	}
	
	public Tractor(String ownerName) {
		this();
		this.ownerName=ownerName;
	}
	
	public Tractor(String ownerName,String brand) {
		this(ownerName);
		this.brand=brand;
	}
	
	public Tractor(String ownerName,String brand,int price) {
		this(ownerName,brand);
		this.price=price;
	}
	
	public Tractor(String ownerName,String brand,int price,String color) {
		this(ownerName,brand,price);
		this.color=color;
	}
	
	public Tractor(String ownerName,String brand,int price,String color,int hp) {
		this(ownerName,brand,price,color);
		this.hp=hp;
	}
	
	public Tractor(String ownerName,String brand,int price,String color,int hp,String model) {
		this(ownerName,brand,price,color,hp);
		this.model=model;
	}
	

}
