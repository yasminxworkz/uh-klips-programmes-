package com.xworkz.equals.runner;

import com.xworkz.equals.contructor.LipStick;

public class LipStickRunner {

	public static void main(String[] args) {
		LipStick lip=new LipStick("topnotch", "mat", "insight", "bangalore", "red", "cylindrical", 2020, 180, 800, false);
        System.out.println(lip);
        
        LipStick lip1=new LipStick("topnotch", "glossy", "nykaa", "mumbai", "pink", "cylindrical", 2019, 200, 1000, true);
        System.out.println(lip1);
        
        boolean makeUp=lip.equals(lip1);
        System.out.println(makeUp);
	}

}
