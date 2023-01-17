package com.xworkz.browser.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
    @Autowired
    @Qualifier("jio")
	private Provider provider;
    
    public Chrome() {
		System.out.println("running chrome");
	}
	
	@Override
	public boolean browse() {
		provider.connect();
		return false;
	}

}
