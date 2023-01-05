package com.xworkz.collections.dto;

import java.io.Serializable;

import com.xworkz.collections.constants.EType;

public class WeaponDTO implements Serializable{
	private String name;
	private String madeBy;
	private int madeOn;
	private int price;
	private EType type;
	
	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, int madeOn, int price, EType type) {
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO casted=(WeaponDTO)obj;
				if(this.name.equals(casted.name) && this.madeBy.equals(casted.madeBy) && this.type.equals(casted.type) && this.price==(casted.price) && this.madeOn==casted.madeOn){
					{
						System.out.println("check for equals");
						return true;
				}
					
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

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public int getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(int madeOn) {
		this.madeOn = madeOn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public EType getType() {
		return type;
	}

	public void setType(EType type) {
		this.type = type;
	}

}
