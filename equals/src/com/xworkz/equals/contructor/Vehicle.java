package com.xworkz.equals.contructor;

public class Vehicle {

	private String name;
	private String type;  
	private String color;
	private String manufacturedAt;
	private int manufacturedYear;
	private int milage;
	private int engineCapacity;
	private long price;
	private boolean famous;
	private boolean working;
	

	
	public Vehicle(String name, String type, String color, String manufacturedAt, int manufacturedYear, int milage,
			int engineCapacity, long price, boolean famous, boolean working) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.manufacturedAt = manufacturedAt;
		this.manufacturedYear = manufacturedYear;
		this.milage = milage;
		this.engineCapacity = engineCapacity;
		this.price = price;
		this.famous = famous;
		this.working = working;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getManufacturedAt() {
		return manufacturedAt;
	}



	public void setManufacturedAt(String manufacturedAt) {
		this.manufacturedAt = manufacturedAt;
	}



	public int getManufacturedYear() {
		return manufacturedYear;
	}



	public void setManufacturedYear(int manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}



	public int getMilage() {
		return milage;
	}



	public void setMilage(int milage) {
		this.milage = milage;
	}



	public int getEngineCapacity() {
		return engineCapacity;
	}



	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}



	public long getPrice() {
		return price;
	}



	public void setPrice(long price) {
		this.price = price;
	}



	public boolean isFamous() {
		return famous;
	}



	public void setFamous(boolean famous) {
		this.famous = famous;
	}



	public boolean isWorking() {
		return working;
	}



	public void setWorking(boolean working) {
		this.working = working;
	}



	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", working="
				+ working + "]";
	}

	public boolean equals(Object object) {
		
		if (object instanceof Vehicle) {
			Vehicle casted = (Vehicle) object;

			if (this.name.equals(casted.name) && this.type.equals(casted.type) ) {
				System.out.println("properties are equal");
				return true;
			}
			
		 else {
			 
			System.err.println("not equal");
		 	
		     }
		}
	
		return false;
		}
				
}

