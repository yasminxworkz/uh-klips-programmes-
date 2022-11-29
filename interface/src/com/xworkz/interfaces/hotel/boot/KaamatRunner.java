package com.xworkz.interfaces.hotel.boot;

import com.xworkz.interfaces.hotel.Hotel;
import com.xworkz.interfaces.hotel.Kaamat;

public class KaamatRunner {

	public static void main(String[] args) {
		Kaamat kaam=new Kaamat();
		kaam.name();
		kaam.floors();
		kaam.location();
		kaam.noOfWaiters();
		kaam.working();
		kaam.isGood();
		
		Hotel hotel=new Kaamat();
		hotel.floors();
		hotel.location();
		hotel.name();
		hotel.noOfWaiters();
		hotel.working();

	}

}
