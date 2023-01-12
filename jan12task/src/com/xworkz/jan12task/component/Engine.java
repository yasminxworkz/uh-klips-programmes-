package com.xworkz.jan12task.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Engine {
	private String name;//c
	private String type;//c
	@Autowired
	@Qualifier("number")
	private int number;//p
	@Autowired
	@Qualifier("eVersion")
	private  int version;//p
	private String company;//c
	private int strokes;//s
	
    @Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company +  "]";
	}

	@Autowired
	public Engine(@Qualifier("eName") String name, @Qualifier("eType") String type, @Qualifier("eCompany") String company) {
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	public int getStrokes() {
		return strokes;
	}
	@Autowired
	@Qualifier("eStrokes")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	
	}
	

	

