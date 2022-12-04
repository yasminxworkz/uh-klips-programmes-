package com.xworkz.abstraction.constructor;

public class Rbi {
	private BankRule bankRule;
	
	public Rbi(BankRule bankRule) {
		this.bankRule=bankRule;
	}
	
	public void checkBalance() {
		if(bankRule!=null) {
			double balance=this.bankRule.minAccountBalance();
			if(balance>50) {
				System.out.println("the person is following bank rules");
				
			}
			else {
				System.out.println("the person is not following bank rules");
			}
		}
	}

}
