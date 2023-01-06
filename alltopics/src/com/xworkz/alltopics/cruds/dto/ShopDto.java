package com.xworkz.alltopics.cruds.dto;

public class ShopDto extends AbstractAuditDto {
	private String name;
	private String ownerName;
	private int ShopNo;
	
	public ShopDto() {
		// TODO Auto-generated constructor stub
	}

	public ShopDto(String name, String ownerName, int shopNo) {
		this.name = name;
		this.ownerName = ownerName;
		ShopNo = shopNo;
	}

	@Override
	public String toString() {
		return "ShopDto [name=" + name + ", ownerName=" + ownerName + ", ShopNo=" + ShopNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getShopNo() {
		return ShopNo;
	}

	public void setShopNo(int shopNo) {
		ShopNo = shopNo;
	}
	

}
