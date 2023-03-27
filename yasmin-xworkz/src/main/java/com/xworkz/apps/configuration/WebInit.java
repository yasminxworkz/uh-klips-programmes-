package com.xworkz.apps.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public WebInit() {
		log.info("created " + getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("getRootConfigClasses..................");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] c = { AppConfiguration.class };
		return c;
	}

	@Override
	protected String[] getServletMappings() {
		String[] s = { "/" };
		return s;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		configurer.enable();

	}  // it is used when handler mapping fails to find any action of a request
	
	@Override
	protected void customizeRegistration(Dynamic registration) {
		String tempDir="D:\\temp";
		int maxUploadSizeInMb=3*1024*1024;  //max length
		File UploadDirectory=new File(tempDir);// path used by server
		MultipartConfigElement multipartConfigElement=new MultipartConfigElement(UploadDirectory.getAbsolutePath(),maxUploadSizeInMb,maxUploadSizeInMb*2,maxUploadSizeInMb/2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}
