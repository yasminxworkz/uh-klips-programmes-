package com.xworkz.browser.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	
	
	
	public Jio() {
		System.out.println("running jio");
		
	}

	@Override
	public boolean connect() {
		System.out.println("connect method");  
		return true;
	}

}
