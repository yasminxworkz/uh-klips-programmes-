package com.xworkz.crudss.repository;

import com.xworkz.crudss.dto.HelmetDTO;

public class HelmetRepositoryImp implements HelmetRepository {

	private HelmetDTO[] helmetdto=new HelmetDTO[10];
	private int currentIndex=0;
	@Override
	public boolean save(HelmetDTO dto) {
		if(this.currentIndex>=this.helmetdto.length) {
			System.out.println("size exceeded cannot add more helmets");
			return false;
		}
		
		this.helmetdto[this.currentIndex]=dto;
		System.out.println("Saved" + dto + "in index" + currentIndex);
		currentIndex++;
		
		return true;
	}

}
