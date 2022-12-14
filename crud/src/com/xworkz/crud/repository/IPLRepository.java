package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IPLDto;

public interface IPLRepository {
	
	boolean create(IPLDto dto);
	
	default int total() {
		return 0;
	}
	
	default String teamMembers(String argument) {
		return null;
	}
	

}
