package com.xworkz.association.array.constructor;

public class CompanyLocation {

		public String street;
		public int no;
		public City city;
		public State state;
		public Country country;
		
		public CompanyLocation(String street,int no) {
			this.street=street;
			this.no=no;
		}
		
		public void displayDetails() {
			if (city!=null) {
				city.displayDetails();
			}
			else {
				System.out.println("city is null");
			}
			if (state!=null) {
				state.displayDetails();
			}
			else {
				System.out.println("state is null");
			}
			if (country!=null) {
				country.displayDetails();
			}
			else {
				System.out.println("country is null");
			}
			
			System.out.println(this.street);
			System.out.println(this.no);
		}

}
