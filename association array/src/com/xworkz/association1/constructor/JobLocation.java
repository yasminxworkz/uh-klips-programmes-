package com.xworkz.association1.constructor;

public class JobLocation {
	JobCity city = new JobCity();
	JobState state = new JobState();
	JobCountry country = new JobCountry();

	public void dislpay(int no, String street) {

		System.out.println(" office number : " + no);
		System.out.println(" office street : " + street);

		city.display("bangalore", true, 560081, 32000000);
		state.display("karnatak", "Bangalore", "bommai", 31);
		country.display("india", "delhi", "modi", 28);

	}

}
