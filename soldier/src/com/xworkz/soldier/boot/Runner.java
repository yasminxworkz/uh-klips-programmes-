package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.repository.SoldierRepoImp;
import com.xworkz.soldier.service.SoldierServiceImp;

public class Runner {

	public static void main(String[] args) {
		SoldierDto dto=new SoldierDto("AnilChauhan", "CDF", "NewDelhi", 4);
		SoldierRepoImp repo=new SoldierRepoImp();
		SoldierServiceImp service=new SoldierServiceImp();
		service.soldier(repo);
		service.validateAndSave(dto);
		
		
		
		
		
		
		

	}

}
