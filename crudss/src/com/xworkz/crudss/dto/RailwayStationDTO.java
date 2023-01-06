package com.xworkz.crudss.dto;

import java.time.LocalDateTime;

public class RailwayStationDTO extends AbstractAuditDTO {
	private String name;
	private int noOfPlatforms;
	private int area;
	private double platformTicketPrice;
	
	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}
	
	public RailwayStationDTO() {
		// TODO Auto-generated constructor stub
	}

	public RailwayStationDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,String name, int noOfPlatforms, int area, double platformTicketPrice) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public double getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(double platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}
	
	
	
	

}
