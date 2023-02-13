package com.xworkz.movies.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MoviesInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public MoviesInit() {
		System.out.println("created MoviesInit.......");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses........");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] c = { MoviesConfiguration.class };
		return c;
	}

	@Override
	protected String[] getServletMappings() {
		String[] s = { "/" };
		return s;
	}

}
