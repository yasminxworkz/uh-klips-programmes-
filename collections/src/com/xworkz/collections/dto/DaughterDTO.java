package com.xworkz.collections.dto;

public class DaughterDTO {
	private String name;
	private long mobileNo;
	private int age;
	private boolean committed;
	private boolean alive;
	
	public DaughterDTO() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDTO(String name, long mobileNo, int age, boolean committed, boolean alive) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.committed = committed;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobileNo=" + mobileNo + ", age=" + age + ", committed=" + committed
				+ ", alive=" + alive + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public boolean equals(Object da) {
		if(da!=null) {
			if(da instanceof DaughterDTO) {
				DaughterDTO casted=(DaughterDTO)da;
				if(this.name.equals(casted.name) && this.age==(casted.age)  ){
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

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	

}
