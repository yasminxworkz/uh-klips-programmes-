package com.xworkz.association1.constructor;

public class EmailState {
	public String name;
	public String capital;
	public String cm;
	public int districts;
	
	public EmailState(String name,String capital,String cm,int districts) {
		this.name=name;
		this.capital=capital;
		this.cm=cm;
		this.districts=districts;
	}
	
		public void display()
		{
			System.out.println("====printing email company state details====");

			System.out.println(" state name : "+name);
			System.out.println(" state capital : "+capital);
			System.out.println(" state cm : "+cm);
			System.out.println(" districts in state : "+districts);
		}

}

