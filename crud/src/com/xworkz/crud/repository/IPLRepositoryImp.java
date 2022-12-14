package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IPLDto;
import com.xworkz.crud.exception.ArraySizeExceededCantStoreMoredetails;

public class IPLRepositoryImp implements IPLRepository {

	

	private IPLDto[] iplDtos = new IPLDto[10];

	private int currentIndex = 0;

	@Override
	public boolean create(IPLDto dto) {
		System.out.println("Running create of IPLDto" + dto);
		if (this.currentIndex >= this.iplDtos.length) {
			System.err.println("size exceeded cannot add more iplTeam");
		throw new ArraySizeExceededCantStoreMoredetails();
		}

		this.iplDtos[this.currentIndex] = dto;
		System.out.println("Saved" + dto + "in index" + currentIndex);
		currentIndex++;
		return true;

	}
	
	@Override
	public int total() {
		System.out.println("running the total");
		return IPLRepository.super.total();
	}
	
	@Override
	public String teamMembers(String argument) {
         System.out.println("running teamMembers "+argument);
         for(IPLDto ipl:iplDtos) {
        	 if(ipl!=null && ipl.getTeamName().equalsIgnoreCase(argument) ) {
        		 System.out.println("ipl dto is found for "+argument);
        		 
        	 }
         }
         
         System.out.println("no ipl dto found for");
        
		return IPLRepository.super.teamMembers(argument);
	}
	
	
}
