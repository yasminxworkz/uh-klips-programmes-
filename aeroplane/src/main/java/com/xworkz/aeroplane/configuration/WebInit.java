package com.xworkz.aeroplane.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses.......... ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] c= {AirConfiguration.class};
		return c;
	}

	@Override
	protected String[] getServletMappings() {
		String[] s= {"/"};
		return s;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		configurer.enable();
	}
}
