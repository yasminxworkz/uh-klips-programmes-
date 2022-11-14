package com.xworkz.association1.constructor;

public class EmailLocation {
	
		public int no;
		public String street;
		public EmailCity city ;
		public EmailState state;
		public EmailCountry country;

		public void setStreet(int no, String street)
		{ this.no=no;
		  this.street=street;
		}
		
		public void setEmailCity(EmailCity city) {
			this.city=city;
			
		}
		public void setEmailState(EmailState state) {
			this.state=state;
			
		}
		
		public void setEmailCountry( EmailCountry country) {
			this.country=country;
		}
	
             public void display() {
            	 
			System.out.println(" office number : " + no);
			System.out.println(" office street : " + street);
            city.display();
            state.display();
            country.display();
            
            
			
		}

}
