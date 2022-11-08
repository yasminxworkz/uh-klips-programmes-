package com.xworkz.association.array.boot;

import com.xworkz.association.array.constructor.Email;
import com.xworkz.association.array.constructor.EmailCompany;
import com.xworkz.association.array.constructor.Job;
import com.xworkz.association.array.constructor.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Person person = new Person("yasmin");

		Email email1 = new Email();
		email1.setEmail("yasmin@gmail.com", 23456789l, 83456721l);

		Email email2 = new Email();
		email2.setEmail("yasmink@gmail.com", 33456789l, 73456721l);

		Email[] emails = { email1, email2 };
		person.setMail(emails);
		Job job = new Job("trainer", 2500);

		person.setJob(job);
		
		EmailCompany company=new EmailCompany();
		company.setEmailCompany("unibic","manikant");
		
		

	}

}
