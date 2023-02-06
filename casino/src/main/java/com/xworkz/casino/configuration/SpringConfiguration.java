package com.xworkz.casino.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.casino")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Runnning SpringConfiguration...............");
	}

}
