package com.xworkz.alltopics.cruds.boot;

import com.xworkz.alltopics.cruds.dto.ShopDto;
import com.xworkz.alltopics.cruds.repository.StoreRepo;
import com.xworkz.alltopics.cruds.repository.StoreRepoImp;
import com.xworkz.alltopics.cruds.service.ShopService;
import com.xworkz.alltopics.cruds.service.ShopServiceImp;

public class ShopRunner {

	public static void main(String[] args) {
		
		ShopDto dto=new ShopDto("moreee", "xyzsss", 4);
		StoreRepo store=new StoreRepoImp();
		ShopService service=new ShopServiceImp(store);
		boolean success=service.validateandSave(dto);

	}

}
