package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
	Collection<ApplicationDTO> app=new ArrayList<ApplicationDTO>();
	app.add(new ApplicationDTO("java", 1.8, "james Gosling", 0, true));
	app.add(new ApplicationDTO("hotstar", 5.1, "novi digital", 350, false));
	app.add(new ApplicationDTO("gmail", 2022.11, "google", 0, true));
	app.add(new ApplicationDTO("googleDrive", 2.22, "google", 0, true));
	
	app.stream().filter((p)->p.isFree() && p.getDevelopedBy()=="google").collect(Collectors.toSet()).forEach(pr->System.out.println(pr));
	
	System.out.println(System.lineSeparator());
	
	System.out.println("**************************************versions greater than 5***********************************************************");
	app.stream().filter((p)->p.getVersion()>5).collect(Collectors.toSet()).forEach(pr->System.out.println(pr.getName()));
	

	}

}
