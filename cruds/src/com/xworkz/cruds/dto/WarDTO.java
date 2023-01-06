package com.xworkz.cruds.dto;

public class WarDTO {
	private String name;
	private int startDate;
	private int endDate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeaths;
	
	public WarDTO() {
		super();
	}

	public WarDTO(String name, int startDate, int endDate, String startedBy, String startedWith, String wonBy,
			int noOfDeaths) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		this.wonBy = wonBy;
		this.noOfDeaths = noOfDeaths;
	}
	
	
	

}
