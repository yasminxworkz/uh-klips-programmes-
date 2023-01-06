package com.xworkz.crudss.repository;

import com.xworkz.crudss.dto.BakeryDTO;
import com.xworkz.crudss.exception.ArrayIndexExceededException;


public class BakeryRepositoryImp implements BakeryRepository {

	private BakeryDTO[] bakeryDTO=new BakeryDTO[10];
	private int currentIndex=0; 
	
	@Override
	public boolean create(BakeryDTO dto) {
		
		if(this.currentIndex>=this.bakeryDTO.length) {
			System.out.println("size exceeded cannot add more helmets");
			throw new ArrayIndexExceededException();
		}
		
		this.bakeryDTO[this.currentIndex]=dto;
		System.out.println("Saved" + dto + "in index" + currentIndex);
		currentIndex++;
		return true;
	}

}


