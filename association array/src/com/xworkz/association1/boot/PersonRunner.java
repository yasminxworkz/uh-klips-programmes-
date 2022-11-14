package com.xworkz.association1.boot;


import com.xworkz.association1.constructor.Email;
import com.xworkz.association1.constructor.EmailCity;
import com.xworkz.association1.constructor.EmailCompany;
import com.xworkz.association1.constructor.EmailCountry;
import com.xworkz.association1.constructor.EmailLocation;
import com.xworkz.association1.constructor.EmailState;
import com.xworkz.association1.constructor.Job;
import com.xworkz.association1.constructor.JobCity;
import com.xworkz.association1.constructor.JobCompany;
import com.xworkz.association1.constructor.JobCountry;
import com.xworkz.association1.constructor.JobLocation;
import com.xworkz.association1.constructor.JobState;
import com.xworkz.association1.constructor.Person;

public class PersonRunner {
	public static void main(String[] args) {
		   Person person=new Person();
		  
		   Email email=new Email("yasmin@gmail.com","yasmin",81234567);
		   
		   Email email1 =new Email("vinoda@gmail.com","vinoda",98765432);
		   Email[]emails= {email,email1};
		   person.setEmail(emails);
		   
		   EmailCompany ecompany=new EmailCompany();
		   ecompany.setNames("gmail", "mumbai");   
		   email1.setEcompany(ecompany);
		   email.setEcompany(ecompany);
		   
		   EmailLocation elocation=new EmailLocation ();
		   elocation.setStreet(45,"commercial street");
		   ecompany.setLocation(elocation);
		   
		   EmailCity city=new EmailCity("mumbai",true,400001,200000000000l);
		   elocation.setEmailCity(city);
		   
		   EmailState state=new EmailState("tamilnadu","chennai","stalin",38);
		   elocation.setEmailState(state);
		   
		   EmailCountry country=new EmailCountry("USA","washingtonDC","joy bidon",50);
		   elocation.setEmailCountry(country);
		   
		   Job job=new Job(25000,"associate",true);
		   JobCompany company=new JobCompany("infosys","narayanmurti");
		   job.setCompany(company);
		   person.setJob(job);
		   
		   JobLocation jLocation=new JobLocation(54,"J P");
		   company.setJobLocation(jLocation);
		   
		   JobCity jCity=new JobCity("bangalore",true,560081,32000000);
		   jLocation.setJobCity(jCity);
		   
		   JobState jState=new JobState("karnataka","bengaluru","bommai",31);
		   jLocation.setJobState(jState);
		   
		   JobCountry jCountry=new JobCountry("India","delhi","modi",28);
		   jLocation.setJobCountry(jCountry);
		  
		   person.display();

	}

}
