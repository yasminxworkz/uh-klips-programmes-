package com.xworkz.collections.dto;

import java.io.Serializable;

import com.xworkz.collections.constants.Type;

public class DataBaseVendorDTO implements Serializable{
	private String name;
	private String developedBy;
	private int size;
	private int licenseCost;
	private Type type;
	
	public DataBaseVendorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVendorDTO(String name, String developedBy, int size, int licenseCost, Type type) {
		this.name = name;
		this.developedBy = developedBy;
		this.size = size;
		this.licenseCost = licenseCost;
		this.type = type;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", size=" + size + ", licenseCost="
				+ licenseCost + ", type=" + type + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public boolean equals(Object data) {
		if(data!=null) {
			if(data instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO casted=(DataBaseVendorDTO)data;
				if(this.licenseCost==(casted.licenseCost) && this.type.equals(casted.type) &&  this.developedBy.equals(casted.developedBy) ){
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

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(int licenseCost) {
		this.licenseCost = licenseCost;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
}
