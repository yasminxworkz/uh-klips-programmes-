package com.xworkz.alltopics.abstraction.thing;

public class Rbi {
	private Bank bank;
	
	public Rbi(Bank bank) {
		this.bank=bank;
	}
	
	public void checkBalance() {
		if(bank!=null) {
			double balance=this.bank.minAccountBalance();
			if(balance>50) {
				System.out.println("maintaining acc balance");
			}
			
			else {
				System.out.println("not following rules");
			}
		}
	}

}
