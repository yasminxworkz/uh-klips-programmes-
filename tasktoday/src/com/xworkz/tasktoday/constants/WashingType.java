package com.xworkz.tasktoday.constants;

public enum WashingType {
	
	NORMAL(5,"yasmin"),GENTLE(6,"haji");
	
	public  int load;
	public  String owner;
	
	private WashingType(int load,String owner)
	{
		this.owner=owner;
		this.load=load;
	}
	
	
	
}
