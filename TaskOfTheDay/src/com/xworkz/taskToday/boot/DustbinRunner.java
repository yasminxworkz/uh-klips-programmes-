package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		
		Dustbin dustbin=new Dustbin();
		System.out.println("values assigned using literals");
		System.out.println(dustbin.color);
		System.out.println(dustbin.type);
		System.out.println(dustbin.height);
		System.out.println(dustbin.garbageType);
		System.out.println(dustbin.shape);
		System.out.println(dustbin.function);
		System.out.println(dustbin.madeUpOf);
		System.out.println(dustbin.companyName);
		System.out.println(dustbin.Quantity);
		
		dustbin.design="flowerPrint";
		dustbin.wheeled=true;
		dustbin.mechanism="automatic";
		dustbin.trashlayout="double";
		dustbin.compartments=2;
		dustbin.namingStickers="recyclable";
		dustbin.garbageOdor="bad";
		dustbin.location="kitchen";
		dustbin.washable=true;
		dustbin.coversColor="black";
		
		System.out.println("values assigned using instantiation");
		System.out.println(dustbin.design);
		System.out.println(dustbin.wheeled);
		System.out.println(dustbin.mechanism);
		System.out.println(dustbin.trashlayout);
		System.out.println(dustbin.compartments);
		System.out.println(dustbin.namingStickers);
		System.out.println(dustbin.garbageOdor);
		System.out.println(dustbin.location);
		System.out.println(dustbin.washable);
		System.out.println(dustbin.coversColor);

	}

}

