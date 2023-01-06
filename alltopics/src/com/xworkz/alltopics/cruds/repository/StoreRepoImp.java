package com.xworkz.alltopics.cruds.repository;

import com.xworkz.alltopics.cruds.dto.ShopDto;

public class StoreRepoImp implements StoreRepo{

	private  ShopDto[]shop=new ShopDto[10];
	private int currentIndex=0;
	
	
	@Override
	public boolean create(ShopDto dto) {
		if(this.currentIndex>=this.shop.length) {
			System.out.println("sizeExceeded");
		}
		
		
		this.shop[this.currentIndex]=dto;
		System.out.println("index"+currentIndex+"saved" + dto);
		currentIndex++;
		return true;
	}
	
}
