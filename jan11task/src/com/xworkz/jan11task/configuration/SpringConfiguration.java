package com.xworkz.jan11task.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.jan11task")
public class SpringConfiguration {
	
	@Bean
	public String name() {
		return "IDWorld";
	}
	@Bean
	public String owner() {
		return "muniyappa";
	}
	@Bean
	public String address() {
		return "JeevanNagar";
	}
	@Bean
	public int id() {
		return 657845;
	}
	
	@Bean
	public String gstNo() {
		return "29BGWPM&095";
	}

	@Bean
	public String humanName() {
		
		String s=new String("AbdulKalam");
		return s;
	}
	
	@Bean
	public byte noOfBooks() {
		return 80;
	}
	
	@Bean
	public short workingYears() {
		return 10;
	}
	
	@Bean
	public int age() {
	return 84;	
	}
	
	@Bean
	public long salary() {
		return 80000;
	}
	
	@Bean
	public float weight() {
		return 65.5f;
	}
	
	@Bean
	public double height() {
		return 6.2d;
	}
	
	@Bean
	public char gender() {
		return 'm';
	}
	
	@Bean
	public boolean alive() {
		return false;
	}
	
	@Bean
	public String pencilName() {
		return"apsara";
	}
	
	@Bean
	public String type() {
		return "wooden";
	}
	
	@Bean
	public double price() {
		return 5.5;
	}
	
	@Bean
	public String color() {
		return "black";
	}
	
	@Bean
	public boolean sharp() {
		return true;
	}
	
	@Bean
	public boolean stolen() {
		return false;
	}
	
	@Bean
	public String eraser() {
		return "Doms";
	}
	
	@Bean
	public String eType() {
		return "vinylEraser";
	}
	
	@Bean
	public double ePrice() {
		return 4.5d;
	}
	
	@Bean
	public String eColor() {
		return "white";
	}
	
	@Bean
	public String shape() {
		return"square";
	}
	
	@Bean
	public double size() {
		return 3.2;
	}
	
	@Bean
	public boolean eStolen() {
		return false;
	}
	
	@Bean
	public String sName() {
		return "Linux";
	}
	
	@Bean
	public double version() {
		return 3.0d;
	}
	
	@Bean
	public String developer() {
		return "Linus";
	}
	
	@Bean
	public int date() {
		return 1991;
	}
	
	@Bean
	public boolean free() {
		return true;
	}
	
	@Bean
	public String engineer() {
		return "shagufta";
	}
	
	@Bean
	public long sSalary() {
		return 100000;
	}
	
	@Bean
	public String companyName() {
		return"infosys";
	}
	
	@Bean
	public double experience() {
		return 6.5d;
	}
	
}
