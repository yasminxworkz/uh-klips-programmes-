package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.TheatreDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.TheatreRepository;

public class TheatreServiceImp implements TheatreService{
	TheatreRepository theatreRepository;

	public TheatreServiceImp(TheatreRepository theatreRepository) {
		super();
		this.theatreRepository = theatreRepository;
	}

	@Override
	public boolean validateAndSave(TheatreDTO dto) throws ValidationException {
        String id=dto.getId();
		String name=dto.getName();
		 String brand=dto.getBrand();
		 int seats=dto.getSeats();
		 
		 boolean validId=false;
		 boolean validName=false;
		 boolean validBrand=false;
		 boolean validSeats=false;
		 
		 if(id !=null && id.length()>=3 && id.length()<=20) {
			 System.out.println("thetare is valid "+id);
			 validId=true; 
		 }
		 
		 else {
			 System.out.println("thetare is invalid ");
		 }
		 
		 if(name !=null && name.length()>=3 && name.length()<=20) {
			 System.out.println("theatre is valid "+name);
			 validName=true;
		 }
		 
		 else {
			 System.out.println("thetare is invalid ");
		 }
		 
		 if(brand!=null && brand.length()>=3 && brand.length()<20) {
			 System.out.println("theatre is valid "+brand);
			 validBrand=true;
		 }
		 
		 else {
			 System.out.println("thetare is invalid ");
		 }
		 
		 if(seats !=0 && seats>50 && seats<500) {
			 System.out.println("theatre is valid "+seats);
			 validSeats=true;
		 }
		 
		 else {
			 System.out.println("thetare is invalid ");
		 }
		 
		 if(validId && validName && validBrand && validSeats) {
			 System.out.println("Theatre is valid");
			 boolean saved=this.theatreRepository.create(dto);
			 System.out.println("saved "+saved);
			 throw new ValidationException();
		 }
		 
		 System.out.println("theatre is not valid");
		 
		return false;
	}
	
	

}
