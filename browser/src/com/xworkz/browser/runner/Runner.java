package com.xworkz.browser.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.browser.component.Chrome;
import com.xworkz.browser.configuration.BrowserConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(BrowserConfiguration.class);
        System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Chrome c=container.getBean(Chrome.class);
		System.out.println(c.browse());
	}

}
