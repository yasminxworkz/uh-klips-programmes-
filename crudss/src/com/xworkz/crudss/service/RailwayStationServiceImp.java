package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.RailwayStationDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.RailwayStationRepository;

public class RailwayStationServiceImp implements RailwayStationService {
	
	RailwayStationRepository railwayStationRepository;
	
	public RailwayStationServiceImp(RailwayStationRepository railwayStationRepository) {
		this. railwayStationRepository=railwayStationRepository;
	}

	@Override
	public boolean validateandSave(RailwayStationDTO dto) throws ValidationException {
		 String name=dto.getName();
		 int noOfPlatforms=dto.getNoOfPlatforms();
		 int area=dto.getArea();
		 double platformTicketPrice=dto.getPlatformTicketPrice();
		 
		 boolean validName=false;
		 boolean validNoOfPlatforms=false;
		 boolean validArea=false;
		 boolean validPlatformTicketPrice=false;
		 
		 if(name!=null && name.length()>3 && name.length()<20) {
			 System.out.println("RailwayStation is valid "+name);
			 validName=true;
		 }
		 
		 else {
			 System.out.println("RailwayStation is invalid");
		 }
		 
		 if(noOfPlatforms!=0 && noOfPlatforms>3 && noOfPlatforms<20) {
			 System.out.println("RailwayStation is valid "+noOfPlatforms);
			 validNoOfPlatforms=true;
		 }
		 
		 else {
			 System.out.println("Railway Station is invalid");
		 }
		 
		 if(area!=0 && area>23456 && area<2345678) {
			 System.out.println("RailwayStation is valid "+area);
			 validArea=true;
			 
		 }
		 
		 else {
			 System.out.println("Railway Station is invalid");
		 }
		 
		 if(platformTicketPrice!=0 && platformTicketPrice>=3 && platformTicketPrice<=20) {
			 System.out.println("Railway Station is valid "+platformTicketPrice);
			 validPlatformTicketPrice=true;
		 }
		 
		 else {
			 System.out.println("Railway Station is invalid");
		 }
		 
		 if(validName && validNoOfPlatforms && validArea && validPlatformTicketPrice) {
			 boolean saved=this.railwayStationRepository.create(dto);
			 System.out.println(saved);
			 throw new ValidationException();
		 }
		
		 return false;
		
	}

}
