package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constants.WashingType;
import com.xworkz.tasktoday.constructor.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		String[] brands= {"whirlpool","godrej","samsung","onida","LG","heir"};
		
		WashingMachine washingMachine=new WashingMachine("grey","topload",6.5d,brands,WashingType.NORMAL);
		
		washingMachine.displayDetails();

	}

}
