package com.xworkz.collections.boot;

import java.util.HashMap;
import java.util.*;

public class MapCollect{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(2, "kitkat");
		m.put(1, "dairyMilk");
		
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((a)->System.out.println(a));
		
		
		

	}

}
