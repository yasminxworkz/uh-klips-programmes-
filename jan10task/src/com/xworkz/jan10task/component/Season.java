package com.xworkz.jan10task.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	//setter
	private String name;
	private String startingMonth;
	private int duration;
	
	
	public String getName() {
		return name;
	}
	
	@Value("Summer")
	public void setName(String name) {
		this.name = name;
	}
	public String getStartingMonth() {
		return startingMonth;
	}
	
	@Value("April")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	
	public int getDuration() {
		return duration;
	}
	
	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	

}
