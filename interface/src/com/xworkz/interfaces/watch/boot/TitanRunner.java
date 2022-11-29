package com.xworkz.interfaces.watch.boot;

import com.xworkz.interfaces.watch.Titan;
import com.xworkz.interfaces.watch.Watch;

public class TitanRunner {

	public static void main(String[] args) {
		
		Titan time=new Titan();
		time.color();
		time.dialShape();
		time.isQualityGood();
		time.noOfDigitsOfTime();
		time.type();
		time.working();
		
		Watch sec=new Titan();
		sec.color();
		sec.dialShape();
		sec.noOfDigitsOfTime();
		sec.type();
		sec.working();
	}

}
