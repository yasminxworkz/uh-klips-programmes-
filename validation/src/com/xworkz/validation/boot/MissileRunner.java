package com.xworkz.validation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.configuration.SpringConfiguration;
import com.xworkz.validation.dto.MissileDto;
import com.xworkz.validation.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		 MissileService missile=container.getBean(MissileService.class);
         boolean savedmissile=missile.validateAndSave(new MissileDto());
         System.out.println(savedmissile);

	}

}
