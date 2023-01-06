package com.xworkz.alltopics.inheritance.constructor;

public class CustardApple extends Fruits {

	
	public void property(int rs, double qty) {
		this.rs = rs;
		this.qty = qty;
		System.out.println("method of subclass");
	}

	@Override
	public void details() {
		System.out.println(rs);
		System.out.println(qty);
	}
}
