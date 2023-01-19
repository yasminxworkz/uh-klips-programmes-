package com.xworkz.validation.configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.validation")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("running configuration class");
	}
	
	@Bean
	public Validator validation() {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}
	

}
