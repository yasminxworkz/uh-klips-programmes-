package com.xworkz.crudss.service;

import com.xworkz.crudss.dto.BakeryDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.BakeryRepository;

public class BakeryServiceImp implements BakeryService {
	
	BakeryRepository bakeryRepository;
	
	public BakeryServiceImp(BakeryRepository bakeryRepository) {
		this.bakeryRepository=bakeryRepository;
	}
	

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws ValidationException {
		String name=dto.getName();
		String owner=dto.getOwner();
		long contact=dto.getContact();
		String location=dto.getLocation();
		String famousFor=dto.getFamousFor();
		
		boolean validName=false;
		boolean validOwner=false;
		boolean validContact=false;
		boolean validLocation=false;
		boolean validFamousFor=false;
		
		if(name!=null && name.length()>=3 && name.length()<=20)
		{
			System.out.println("bakery is valid "+name);
			validName=true;
		}
		
		else {
			System.out.println("bakery is invalid");
		}
		
		if(owner!=null && owner.length()>=3 && owner.length()<=20) {
			System.out.println("bakery is valid "+owner);
			validOwner=true;
		}
		
		else {
			System.out.println("bakery is invalid");
		}
		
		if(contact!=0 && contact>2345 && contact<880632567) {
			System.out.println("bakery is valid "+contact);
			validContact=true;
		}
		
		else {
			System.out.println("bakery is invalid");
		}
		
		if(location!=null && location.length()>=3 && location.length()<=20) {
			System.out.println("bakery is valid "+location);
			validLocation=true;
		}
		
		else {
			System.out.println("bakery is invalid");
		}
		
		if(famousFor!=null && famousFor.length()>3 && famousFor.length()<20 ) {
			System.out.println("bakery is valid "+famousFor);
			validFamousFor=true;
		}
		
		else {
			System.out.println("bakery is invalid");
		}
		
		if(validName && validFamousFor && validContact && validLocation && validOwner) {
			System.out.println("bakery is valid");
			boolean saved=this.bakeryRepository.create(dto);
			System.out.println("saved "+saved);
			throw new ValidationException();
		}
		
		System.out.println("bakery is invalid");
		return false;
	}

}
