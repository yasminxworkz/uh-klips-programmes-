package com.xworkz.crudss.boot;

import com.xworkz.crudss.constant.HelmetColor;
import com.xworkz.crudss.constant.HelmetType;
import com.xworkz.crudss.dto.HelmetDTO;
import com.xworkz.crudss.repository.HelmetRepository;
import com.xworkz.crudss.repository.HelmetRepositoryImp;
import com.xworkz.crudss.service.HelmetService;
import com.xworkz.crudss.service.HelmetServiceImp;

public class HelmetRunner {

	
	
	public static void main(String[] args) {

		HelmetDTO dto = new HelmetDTO();
		dto.setBrand("honda");
		dto.setColor(HelmetColor.YELLOW);
		dto.setPrice(500);
		dto.setType(HelmetType.SPORTS);
		HelmetRepository helmet = new HelmetRepositoryImp();
		HelmetService serve = new HelmetServiceImp(helmet);
		boolean success=serve.validateAndSave(dto);
		System.out.println("success "+success);

	}

}
