package com.xworkz.inheritance.jail.constructor;

public class CentralJail extends Jail {
	public int noOfPrisoners=22000;
	public boolean working=true;
	
	CentralJail centre=new CentralJail();
	Jail centre1=new CentralJail();
	CentralJail punish2=(CentralJail)centre;

}
