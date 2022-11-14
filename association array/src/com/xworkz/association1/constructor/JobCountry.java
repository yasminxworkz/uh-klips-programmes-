package com.xworkz.association1.constructor;

public class JobCountry {
	public String name;
	public String capital;
	public String PM;
	public int states;
	
	public JobCountry(String name,String capital,String PM,int states) {
		this.name=name;
		this.capital=capital;
		this.PM=PM;
		this.states=states;
	}
	
	public void display()
	{
		System.out.println("====printing company country details====");

		System.out.println(" country name : "+name);
		System.out.println(" country capital : "+capital);
		System.out.println(" country PM : "+PM);
		System.out.println(" states in country  : "+states);
	}

}
