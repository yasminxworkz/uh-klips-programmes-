package com.xworkz.apps.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	
	public WebInit() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses..................");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] c= {AppConfiguration.class};
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
