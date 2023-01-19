package com.xworkz.validation.boot;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.configuration.SpringConfiguration;
import com.xworkz.validation.dto.FirstAidDto;
import com.xworkz.validation.dto.MissileDto;
import com.xworkz.validation.dto.ResortDto;
import com.xworkz.validation.service.FirstAidsService;

import com.xworkz.validation.service.MissileService;
import com.xworkz.validation.service.ResortService;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
        
		FirstAidsService service=container.getBean(FirstAidsService.class);
           boolean saved=service.validateAndSave(new FirstAidDto("white"));
           System.out.println(saved);
          
           MissileService missile=container.getBean(MissileService.class);
           boolean savedmissile=missile.validateAndSave(new MissileDto());
           System.out.println(savedmissile);
          
           ResortService resort=container.getBean(ResortService.class);
           boolean savedresort=resort.validateAndSave(new  ResortDto());
           System.out.println(savedresort);
           
		
		

	}

}
