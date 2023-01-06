package com.xworkz.crudss.boot;

import com.xworkz.crudss.dto.BakeryDTO;
import com.xworkz.crudss.exception.ValidationException;
import com.xworkz.crudss.repository.BakeryRepository;
import com.xworkz.crudss.repository.BakeryRepositoryImp;
import com.xworkz.crudss.service.BakeryService;
import com.xworkz.crudss.service.BakeryServiceImp;

public class BakeryRunner  {
	
	public static void main(String[] args) {
		BakeryDTO bakery=new BakeryDTO("Rambhavan", "shiv", 765437289, "bagalkot", "pasteries", null, null, null, null);
		BakeryRepository repo=new BakeryRepositoryImp();
		BakeryService service=new BakeryServiceImp(repo);
		
		boolean success;
		{
			try {
				success=service.validateAndSave(bakery);//reference of bakery service object :-service  && validate and save is the method declared in bakery service interface  && bakery is the reference of bakery DTO
			}
			catch(ValidationException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
