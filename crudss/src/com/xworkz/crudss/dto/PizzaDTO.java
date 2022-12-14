package com.xworkz.crudss.dto;

import java.time.LocalDateTime;

import com.xworkz.crudss.constant.PizzaSize;

public class PizzaDTO extends AbstractAuditDTO {
	private String name;//not null min 4,max 20
	private String company;//not null min 4,max 20
	private String flavour;//not null,min3,max 20
	private String type; //not null, veg or nonveg
	private PizzaSize size;//not null
	private boolean cheese;
	private double price;//>50,<2000
	
	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", flavour=" + flavour + ", type=" + type
				+ ", size=" + size + ", cheese=" + cheese + ", price=" + price + ", toString()=" + super.toString()
				+ "]";
	}
	
	public PizzaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PizzaDTO(String name, String company, String flavour, String type, PizzaSize size, boolean cheese,
			double price,String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy,createdDate,updatedBy,updatedDate);
		this.name = name;
		this.company = company;
		this.flavour = flavour;
		this.type = type;
		this.size = size;
		this.cheese = cheese;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

	
	
	

}
