package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.HashSet;

public class BottleSetDTO implements Serializable{
	
	private String type;
	private double height;
	private String color;
	private String shape;
	private int price;
	
	public BottleSetDTO() {
		// TODO Auto-generated constructor stub
	}

	public BottleSetDTO(String type, double height, String color, String shape, int price) {
		this.type = type;
		this.height = height;
		this.color = color;
		this.shape = shape;
		this.price = price;
	}

	@Override
	public String toString() {
		return "BottleSetDTO [type=" + type + ", height=" + height + ", color=" + color + ", shape=" + shape
				+ ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		
		return 4;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof BottleSetDTO) {
				BottleSetDTO casted=(BottleSetDTO)obj;
				if(this.type.equals(casted.type)) {
			System.out.println("equals checking");
					return true;
				}
			}
		}
		return false;
      }

	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	

}
