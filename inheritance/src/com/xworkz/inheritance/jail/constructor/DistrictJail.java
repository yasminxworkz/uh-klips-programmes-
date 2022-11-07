package com.xworkz.inheritance.jail.constructor;

public class DistrictJail extends Jail{
	public String state="kerala";
	public String presentDGP="sudeshKumar";
	
	DistrictJail jail=new DistrictJail();
	Jail jail1=new DistrictJail();
	DistrictJail punish=(DistrictJail)jail1;
	
	

}
