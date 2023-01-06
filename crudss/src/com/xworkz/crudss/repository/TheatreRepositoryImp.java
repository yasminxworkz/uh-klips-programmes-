package com.xworkz.crudss.repository;

import com.xworkz.crudss.dto.HelmetDTO;
import com.xworkz.crudss.dto.TheatreDTO;
import com.xworkz.crudss.exception.ArraySizeEXceededException;

public class TheatreRepositoryImp implements TheatreRepository {

	private TheatreDTO[] theatredto=new TheatreDTO[10];
	private int currentIndex=0; 
	
	@Override
	public boolean create(TheatreDTO dto)  {
	
			if(this.currentIndex>=this.theatredto.length) {
				System.out.println("size exceeded cannot add more helmets");
				throw new ArraySizeEXceededException();
			}
			
			this.theatredto[this.currentIndex]=dto;
			System.out.println("Saved" + dto + "in index" + currentIndex);
			currentIndex++;
			
			return true;
		}
		
	}


