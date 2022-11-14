package com.xworkz.association1.constructor;

public class Person {
	    public String name="jaya";
		public Email[] emails ;
        public Job job;
		
		public void setEmail(Email[]emails) {
			this.emails=emails;
		}
		
		public void setJob(Job job) {
			this.job=job;
		}
		
		public void display() {
			System.out.println("====printing details of a person====");
			System.out.println(" person name : " + name);
			job.display();

			if (emails != null && emails.length > 0) {
				for (int i = 0; i < emails.length; i++) {
					Email mail = emails[i];
					if (mail != null) {
						System.out.println("  ***printing email "+(i+1)+" of person***");
						mail.display();
					} else {
						System.out.println("mail is null at index " + i);
					}
				}
			} else {
				System.out.println("the array emails is null");
			}
			
		}

	}



