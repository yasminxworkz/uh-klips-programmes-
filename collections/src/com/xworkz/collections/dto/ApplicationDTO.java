package com.xworkz.collections.dto;

public class ApplicationDTO {
	private String name;
	private double version;
	private String developedBy;
	private int price;
	private boolean free;
	
	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDTO(String name, double version, String developedBy, int price, boolean free) {
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
		this.price = price;
		this.free = free;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", developedBy=" + developedBy + ", price="
				+ price + ", free=" + free + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public boolean equals(Object event) {
		if(event!=null) {
			if(event instanceof ApplicationDTO) {
				ApplicationDTO casted=(ApplicationDTO)event;
				if(this.name.equals(casted.name) && this.version==(casted.version) && this.free==casted.free && this.developedBy.equals(casted.developedBy) ){
					System.out.println("checking for equals");
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	

}
