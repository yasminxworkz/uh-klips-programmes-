package com.xworkz.encapsulation.watch.constructor;

public class Watch {
	String type;
	int price;
	String brand;
	
	boolean working=true;
	String beltType="strap";
	String function="shows time";
	String brandAmbassador="aalia bhatt";
	
	private long watchCompanyRevenue;
	private String color;
	private String owner;
	private boolean comfort;
	private String watchCompanyLocation;
	private int currentTime;
	
	public long getwatchCompanyRevenue(){
		return watchCompanyRevenue;
	}
	
	void setwatchCompanyRevenue(long watchCompanyRevenue) {
		this.watchCompanyRevenue=watchCompanyRevenue;
	}
	
	public String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color=color;
	}
	
	public String getOwner() {
		return owner;
	}
	
	void setOwner(String owner) {
		this.owner=owner;
	}
	
	public String getwatchCompanyLocation() {
		return watchCompanyLocation;
	}
	
	void setwatchCompanyLocation(String watchCompanyLocation) {
		this.watchCompanyLocation=watchCompanyLocation;
	}
	
	public int getcurrentTime() {
		return currentTime;
	}
	
	void setcurrentTime(int currentTime) {
		this.currentTime=currentTime;
	}
	
	public boolean isComfort() {
		return comfort;
	}
	
	void setComfort(boolean comfort) {
		this.comfort=comfort;
	}

}
