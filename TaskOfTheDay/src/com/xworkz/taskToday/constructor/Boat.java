package com.xworkz.taskToday.constructor;

public class Boat {
	
	public String name;
	public String color;
	public String companyName;
	public String type;
	public int owner;
	
	public Boat(String name,String color) {
		this.name=name;
		this.color=color;
	}
	
   public Boat(String name,String color, String companyName) {
	   this.name=name;
	   this.color=color;
	   this.companyName=companyName;
	}

   public Boat(String name,String color, String companyName,String type) {
	   this.name=name;
	   this.color=color;
	   this.companyName=companyName;
	   this.type=type;
	}
   
   public Boat(String name,String color, String companyName,String type, int owner) {
	   this.name=name;
	   this.color=color;
	   this.companyName=companyName;
	   this.type=type;
	   this.owner=owner;
  	}
   
   public Boat(String name) {
	   this.name=name;
	}
   
   public Boat(String name,int owner) {
	   this.name=name;
	   this.owner=owner;
	}
   
   public Boat(String name,int owner, String companyName) {
	   this.name=name;
	   this.owner=owner;
	   this.companyName=companyName;
  	}
   
   public Boat(int owner,String name) {
	   this.name=name;
	   this.owner=owner;
	}


}
