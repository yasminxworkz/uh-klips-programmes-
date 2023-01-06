package com.xworkz.crudss.repository;

import com.xworkz.crudss.dto.RailwayStationDTO;
import com.xworkz.crudss.exception.ArraySizeEXceededException;

public class RailwayStationRepositoryImp implements RailwayStationRepository {
	
	private RailwayStationDTO[] railwaydto=new RailwayStationDTO[10];
	private int currentIndex=0;
	
	
	@Override
	public boolean create(RailwayStationDTO dto) {
		if(this.currentIndex>=this.railwaydto.length) {
			System.out.println("size exceeded cannot add more helmets");
			throw new ArraySizeEXceededException();
		}
		
		this.railwaydto[this.currentIndex]=dto;
		System.out.println("Saved" + dto + "in index" + currentIndex);
		currentIndex++;
		
		return true;
	} 

}
