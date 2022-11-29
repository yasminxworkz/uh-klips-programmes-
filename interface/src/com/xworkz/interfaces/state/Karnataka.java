package com.xworkz.interfaces.state;

public class Karnataka implements State{

	@Override
	public boolean largest() {
         System.out.println("it is largest state");	
         return false;
	}

	@Override
	public String chiefMinister() {
		System.out.println("bommai is cm");
		return "chiefMinister";
	}

	@Override
	public void population() {
		System.out.println("country with medium population");
		
	}

	@Override
	public void capital() {
		System.out.println("bangalore");
		
	}

	@Override
	public void famousFor(String Sweet) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isCapital() {
		return true;
	}

	

}
