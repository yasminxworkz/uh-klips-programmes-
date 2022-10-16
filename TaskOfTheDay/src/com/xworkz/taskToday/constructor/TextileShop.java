package com.xworkz.taskToday.constructor;

public class TextileShop {
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownersNoOfWifes;
	public int shopNo;
	public long contactNo;
	
	public TextileShop() {
		
	}
	
	public TextileShop( String ownerName) {
		this();
		this.ownerName=ownerName;
	}
	
	public TextileShop( String ownerName, String ownerWifeName) {
		this(ownerName);
		this.ownerWifeName=ownerWifeName;
	}
	
	public TextileShop( String ownerName, String ownerWifeName,String ownerDaughterName) {
    	this(ownerName,ownerWifeName);
    	this.ownerDaughterName=ownerDaughterName;
	}
    
    public TextileShop( String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber) {
    	this(ownerName,ownerWifeName,ownerDaughterName);
    	this.ownerDaughterNumber=ownerDaughterNumber;
	}
    
    public TextileShop( String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber,int ownersNoOfWifes) {
    	this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber);
    	this.ownersNoOfWifes=ownersNoOfWifes;
	}
    
    public TextileShop( String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber,int ownersNoOfWifes,int shopNo) {
    	this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber,ownersNoOfWifes);
    	this.shopNo=shopNo;
   	}

    public TextileShop( String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber,int ownersNoOfWifes,int shopNo, long contactNo) {
    	this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber,ownersNoOfWifes,shopNo);
    	this.contactNo=contactNo;
   	}

    
	

}
