package com.xworkz.crudss.dto;

import com.xworkz.crudss.constant.HelmetColor;
import com.xworkz.crudss.constant.HelmetType;

public class HelmetDTO extends AbstractAuditDTO {
	private String brand;
	private int price;
	private HelmetType type;
	private HelmetColor color;
	
	public HelmetDTO() {
		// TODO Auto-generated constructor stub
	}

	public HelmetDTO(String brand, int price, HelmetType type, HelmetColor color) {
		
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.color = color;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", price=" + price + ", type=" + type + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public HelmetColor getColor() {
		return color;
	}

	public void setColor(HelmetColor color) {
		this.color = color;
	}
	
	
	
	
	

}
