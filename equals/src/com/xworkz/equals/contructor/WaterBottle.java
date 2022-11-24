package com.xworkz.equals.contructor;

public class WaterBottle {
	
	private String name;
	private String type;
	private String color;
	private String madeUpOf;
	private String Size;
	private String brand;
	private double length;
	private double quantity;
	private long price;
	private boolean goodQuality;
	
	
	public WaterBottle(String name, String type, String color, String madeUpOf, String size, String brand,
			double length, double quantity, long price, boolean goodQuality) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.madeUpOf = madeUpOf;
		Size = size;
		this.brand = brand;
		this.length = length;
		this.quantity = quantity;
		this.price = price;
		this.goodQuality = goodQuality;
	}


	@Override
	public String toString() {
		return "WaterBottle [name=" + name + ", type=" + type + ", color=" + color + ", madeUpOf=" + madeUpOf
				+ ", Size=" + Size + ", brand=" + brand + ", length=" + length + ", quantity=" + quantity + ", price="
				+ price + ", goodQuality=" + goodQuality + "]";
	}
	
	public boolean equals(Object liquid) {
		
		if(liquid instanceof WaterBottle) {
			WaterBottle casted=(WaterBottle)liquid;
			
			if(this.price==casted.price && this.quantity==casted.quantity && this.name.equals(casted.name)) {
				System.out.println("properties are equal");
			return true;
			}
			else {
				System.out.println("properties are not equal");
			}
		}
		
		
		return false;
	}
	

}
