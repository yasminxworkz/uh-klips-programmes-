package com.xworkz.soldier.repository;

import com.xworkz.soldier.dto.SoldierDto;

public class SoldierRepoImp implements SoldierRepo{
	
	public SoldierRepoImp() {
		System.out.println("running soldier repo imp");
	}

	@Override
	public boolean save(SoldierDto dto) {
		System.out.println("saved: "+dto);
		return false;
	}
	
	
	

}
