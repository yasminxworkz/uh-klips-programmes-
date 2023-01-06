package com.xworkz.crudss.boot;

import com.xworkz.crudss.dto.TheatreDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.TheatreRepository;
import com.xworkz.crudss.repository.TheatreRepositoryImp;
import com.xworkz.crudss.service.TheatreService;
import com.xworkz.crudss.service.TheatreServiceImp;

public class TheatreRunner {

	public static void main(String[] args) {
		TheatreDTO theatre=new TheatreDTO(null, null, null, null, "U7899DL1970PTC005389", "lakshmi", "local", 280);
		TheatreRepository repository=new TheatreRepositoryImp();
		TheatreService service=new TheatreServiceImp(repository);
		
		

		boolean success;{
			try {
				success=service.validateAndSave(theatre);
			}
			catch(ValidationException e) {
				e.printStackTrace();
			}
		}
	}

	
}
