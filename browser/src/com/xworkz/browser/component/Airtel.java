package com.xworkz.browser.component;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {
	
	public Airtel() {
		System.out.println("running airtel");
	}
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		return false;
	}

}
