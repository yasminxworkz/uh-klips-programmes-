package com.xworkz.crudss.boot;

import com.xworkz.crudss.dto.RailwayStationDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.RailwayStationRepository;
import com.xworkz.crudss.repository.RailwayStationRepositoryImp;
import com.xworkz.crudss.service.RailwayStationService;
import com.xworkz.crudss.service.RailwayStationServiceImp;

public class RailwayStationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RailwayStationDTO railway=new RailwayStationDTO();
		RailwayStationRepository repo=new RailwayStationRepositoryImp();
		RailwayStationService service=new RailwayStationServiceImp(repo);
		
		boolean success;
		{
			try {
				success=service.validateandSave(railway);
			}
			catch(ValidationException e) {
				e.printStackTrace();
			}
		}
	}

}
