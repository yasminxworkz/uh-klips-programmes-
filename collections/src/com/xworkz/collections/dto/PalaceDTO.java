package com.xworkz.collections.dto;

import java.io.Serializable;
import java.util.Comparator;

public class PalaceDTO implements Serializable{
	
	private String name;
	private String builtBy;
	private boolean destroyed;
	private int visitingFees;
	
	public PalaceDTO() {
		
	}

	public PalaceDTO(String name, String builtBy, boolean destroyed, int visitingFees) {
		this.name = name;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", builtBy=" + builtBy + ", destroyed=" + destroyed + ", visitingFees="
				+ visitingFees + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object event) {
		if(event!=null) {
			if(event instanceof PalaceDTO) {
				PalaceDTO casted=(PalaceDTO)event;
				if(this.name.equals(casted.name) && this.builtBy.equals(casted.builtBy) && this.destroyed==casted.destroyed) {
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

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public int getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(int visitingFees) {
		this.visitingFees = visitingFees;
	}

	

	

	
	

}
