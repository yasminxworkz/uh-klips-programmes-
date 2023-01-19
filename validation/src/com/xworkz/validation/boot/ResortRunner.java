package com.xworkz.validation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.configuration.SpringConfiguration;
import com.xworkz.validation.dto.ResortDto;
import com.xworkz.validation.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		ResortService resort=container.getBean(ResortService.class);
        boolean savedresort=resort.validateAndSave(new  ResortDto());
        System.out.println(savedresort);
	}

}
