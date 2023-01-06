package com.xworkz.crudss.boot;

import com.xworkz.crudss.dto.BuildingDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.BuildingRepository;
import com.xworkz.crudss.repository.BuildingRepositoryImp;
import com.xworkz.crudss.service.BuildingService;
import com.xworkz.crudss.service.BuildingServiceImp;

public class BuildingRunner {
	
	public static void main(String[] args)throws ValidationException {
		
	
	
	BuildingDTO building=new BuildingDTO(10, "kanti", 15, true, true, "commercial", null, null, null, null);
	BuildingRepository repo=new BuildingRepositoryImp();
	BuildingService service=new BuildingServiceImp(repo);
	
	boolean success;
	
	{
		try {
		success=service.validateAndSave(building);	
		}
		catch(ValidationException e) {
			e.printStackTrace();
		}
	}

}
}
