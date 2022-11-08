package com.xworkz.association1.constructor;

public class Person {
	
		Email email = new Email("lokesh.xworkz@gmail.com", "lok@1234", 8865745325L);
		Email email1 = new Email("xworkzLokesh@gmail.com", "lokesh@5656", 6365689567L);
		Email[] emails = { email, email1 };

		public void display(String name) {
			System.out.println("====printing details of a person====");
			System.out.println(" person name : " + name);

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
			Job job=new Job();
			job.display(25000, "Trainer", true);
		}

	}



