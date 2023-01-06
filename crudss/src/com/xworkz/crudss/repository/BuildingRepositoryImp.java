package com.xworkz.crudss.repository;

import com.xworkz.crudss.dto.BakeryDTO;
import com.xworkz.crudss.dto.BuildingDTO;
import com.xworkz.crudss.exception.ArrayIndexExceededException;

public class BuildingRepositoryImp implements BuildingRepository {
	
	private BuildingDTO[] buildingDTO=new BuildingDTO[10];
	private int currentIndex=0;
	
	
	@Override
	public boolean create(BuildingDTO dto) {
			
			if(this.currentIndex>=this.buildingDTO.length) {
				System.out.println("size exceeded cannot add more helmets");
				throw new ArrayIndexExceededException();
			}
			
			this.buildingDTO[this.currentIndex]=dto;
			System.out.println("Saved" + dto + "in index" + currentIndex);
			currentIndex++;
			return true;
		}
		
	} 
	
	


