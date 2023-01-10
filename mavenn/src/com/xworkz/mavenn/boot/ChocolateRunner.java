package com.xworkz.mavenn.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mavenn.configure.SpringConfiguration;
import com.xworkz.mavenn.type.Bag;
import com.xworkz.mavenn.type.Bottle;
import com.xworkz.mavenn.type.Bus;
import com.xworkz.mavenn.type.Cake;
import com.xworkz.mavenn.type.Chair;
import com.xworkz.mavenn.type.Chocolates;
import com.xworkz.mavenn.type.Hotel;
import com.xworkz.mavenn.type.Mask;
import com.xworkz.mavenn.type.Traffic;
import com.xworkz.mavenn.type.Xworkz;

public class ChocolateRunner {

	public static void main(String[] args) {
	
		ApplicationContext app=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Chocolates sweet=app.getBean(Chocolates.class);
		String color=sweet.flavour("blue", 20);
		System.out.println(color);
//		
//		Bag b=app.getBean(Bag.class);
//		System.out.println(b);
//		
//		Bottle drink=app.getBean(Bottle.class);
//		System.out.println(drink);
//		
//		Bus travel=app.getBean(Bus.class);
//		System.out.println(travel);
//		
//		Cake bake=app.getBean(Cake.class);
//		System.out.println(bake);
//		
//		Chair sit=app.getBean(Chair.class);
//		System.out.println(sit);
//		
//		Hotel food=app.getBean(Hotel.class);
//		System.out.println(food);
//
//		Mask mask=app.getBean(Mask.class);
//		System.out.println(mask);
//		
//		Traffic safety=app.getBean(Traffic.class);
//		System.out.println(safety);
//		
//		Xworkz learn=app.getBean(Xworkz.class);
//		System.out.println(learn);
//		
		

	}

}
