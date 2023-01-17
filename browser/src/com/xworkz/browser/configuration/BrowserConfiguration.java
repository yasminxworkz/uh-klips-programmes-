package com.xworkz.browser.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.browser.component.Jio;

@Configuration
@ComponentScan("com.xworkz.browser")
public class BrowserConfiguration {
	
	public BrowserConfiguration() {
		System.out.println("running configuration");
	}
	
	
}
