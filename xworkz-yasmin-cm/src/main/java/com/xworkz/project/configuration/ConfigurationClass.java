package com.xworkz.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

import org.springframework.security.crypto.password.*;
@Configuration
@ComponentScan("com.xworkz.project")
@Slf4j
@EnableScheduling
public class ConfigurationClass {

	public ConfigurationClass() {
		log.info("running ConfigurationClass.........................");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}
	
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
		return bean;
		
	}
	
	@Bean
	public PasswordEncoder encoder() {
		log.info("creating PasswordEncoder" );
		
		PasswordEncoder  encoder=new BCryptPasswordEncoder();
		return encoder;
		
	}
	
	@Bean
	public MultipartResolver multipartResolver() {  
		log.info("registering multipartResolver");
		return new StandardServletMultipartResolver();
	}
	
	
}
