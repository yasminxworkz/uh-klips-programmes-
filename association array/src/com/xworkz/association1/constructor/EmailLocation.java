package com.xworkz.association1.constructor;

public class EmailLocation {
	
		
		EmailCity city = new EmailCity();
		EmailState state = new EmailState();
		EmailCountry country = new EmailCountry();

		public void dislpay(int no, String street) {

			System.out.println(" office number : " + no);
			System.out.println(" office street : " + street);

			city.display("mountain", false, 560081, 32000000);
			state.display("california", "dontknow", "dont know", 31);
			country.display("United States", "sacramento", "dianne fein", 50);

		}

}
