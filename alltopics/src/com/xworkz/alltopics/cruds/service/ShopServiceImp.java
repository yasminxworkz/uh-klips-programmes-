package com.xworkz.alltopics.cruds.service;

import com.xworkz.alltopics.cruds.dto.ShopDto;
import com.xworkz.alltopics.cruds.repository.StoreRepo;

public class ShopServiceImp implements ShopService {
	
	private StoreRepo store;

	public ShopServiceImp(StoreRepo store) {
		this.store = store;
	}

	@Override
	public boolean validateandSave(ShopDto dto) {
		String name=dto.getName();
		String owner=dto.getOwnerName();
		int ShopNo=dto.getShopNo();
		
		boolean validateName=false;
		boolean validateOwner=false;
		boolean ValidateShopNo=false;
		
		if(name!=null && name.length()>5) {
			System.out.println("valid Store");
			validateName=true;
		}
		
		else {
			System.out.println("store is invalid");
		}
		
		if(owner!=null && owner.length()>4) {
			System.out.println("valid Store");
			validateOwner=true;
		}
		
		else {
			System.out.println("store is invalid");
		}
		
		if(ShopNo!=0  && ShopNo>2) {
			System.out.println("valid Store");
			ValidateShopNo=true;
		}
		else {
			System.out.println("store is invalid");
		}
		
		if(validateName && validateOwner  && ValidateShopNo )
			{System.out.println("shop is valid");
		boolean saved=this.store.create(dto);
		System.out.println(saved);
		
			}
		
		//System.out.println("store is invalid");
		return false;
	}
	
	
	

}
