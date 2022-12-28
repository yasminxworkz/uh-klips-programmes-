package com.xworkz.collections.dto;

import java.io.Serializable;

public class SanitizerDTO implements Serializable{

	
	long id;
	String brand;
	int price;
	String color;
	
	public SanitizerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SanitizerDTO(long id, String brand, int price, String color) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	
	
	
	
	}


