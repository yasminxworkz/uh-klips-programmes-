package com.xworkz.browser.component;

import org.springframework.stereotype.Component;

@Component
public class Firefox implements Browser{
	
	public Firefox() {
		System.out.println("Running firefox");
	}

	@Override
	public boolean browse() {
		// TODO Auto-generated method stub
		return false;
	}

}
