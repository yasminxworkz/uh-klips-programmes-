package com.xworkz.collections.dto;

import java.io.Serializable;

public class CompanyCEODto implements Serializable{
	private String name;
	private String company;
	private int age;
	private String qualification;
	private boolean married;
	private DaughterDTO daughterDto;
	
	public CompanyCEODto() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEODto(String name, String company, int age, String qualification, boolean married, DaughterDTO dto) {
		this.name = name;
		this.company = company;
		this.age = age;
		this.qualification = qualification;
		this.married = married;
		this.daughterDto = dto;
	}

	@Override
	public String toString() {
		return "CompanyCEODto [name=" + name + ", company=" + company + ", age=" + age + ", qualification="
				+ qualification + ", married=" + married + ", dto=" + daughterDto + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public boolean equals(Object ceo) {
		if(ceo!=null) {
			if(ceo instanceof CompanyCEODto) {
				CompanyCEODto casted=(CompanyCEODto)ceo;
				if(this.name.equals(casted.name)  && this.married==casted.married && this.company.equals(casted.company) ){
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public DaughterDTO getdaughterDto() {
		return daughterDto;
	}

	public void setDto(DaughterDTO dto) {
		this.daughterDto = dto;
	}
	
	
	
	
	

}
