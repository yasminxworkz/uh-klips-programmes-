package com.xworkz.taskToday.boot;

import com.xworkz.taskToday.constructor.Chain;

public class ChainRunner {

	public static void main(String[] args) {
		
		Chain chain=new Chain("BallChain");
		System.out.println("*******constructor with one argument************");
		System.out.println("chain.type: "+chain.type);
		System.out.println("chain.price: "+chain.price);
		System.out.println("chain.length: "+chain.length);
		System.out.println("chain.material: "+chain.material);
		System.out.println("chain.weight: "+chain.weight);
		System.out.println("chain.stolen: "+chain.stolen);
		System.out.println("chain.usedFor: "+chain.usedFor);
		System.out.println("chain.fresh: "+chain.fresh);
		System.out.println(System.lineSeparator());
		
	    chain=new Chain("BoxChain",22255);
	    System.out.println("*******constructor with two argument************");
		System.out.println("chain.type: "+chain.type);
		System.out.println("chain.price: "+chain.price);
		System.out.println("chain.length: "+chain.length);
		System.out.println("chain.material: "+chain.material);
		System.out.println("chain.weight: "+chain.weight);
		System.out.println("chain.stolen: "+chain.stolen);
		System.out.println("chain.usedFor: "+chain.usedFor);
		System.out.println("chain.fresh: "+chain.fresh);
		System.out.println(System.lineSeparator());
		
		    chain=new Chain("CableChain",4554,24.5d);
		    System.out.println("*******constructor with three argument************");
			System.out.println("chain.type: "+chain.type);
			System.out.println("chain.price: "+chain.price);
			System.out.println("chain.length: "+chain.length);
			System.out.println("chain.material: "+chain.material);
			System.out.println("chain.weight: "+chain.weight);
			System.out.println("chain.stolen: "+chain.stolen);
			System.out.println("chain.usedFor: "+chain.usedFor);
			System.out.println("chain.fresh: "+chain.fresh);
			 System.out.println(System.lineSeparator());
			
			chain=new Chain("LinkChain",12543,18.5d,"gold");
			System.out.println("*******constructor with four argument************");
			System.out.println("chain.type: "+chain.type);
			System.out.println("chain.price: "+chain.price);
			System.out.println("chain.length: "+chain.length);
			System.out.println("chain.material: "+chain.material);
			System.out.println("chain.weight: "+chain.weight);
			System.out.println("chain.stolen: "+chain.stolen);
			System.out.println("chain.usedFor: "+chain.usedFor);
			System.out.println("chain.fresh: "+chain.fresh);
			 System.out.println(System.lineSeparator());
		
			chain=new Chain("LinkChain",12543,18.5d,"redgold",8d);
			System.out.println("*******constructor with five argument************");
			System.out.println("chain.type: "+chain.type);
			System.out.println("chain.price: "+chain.price);
			System.out.println("chain.length: "+chain.length);
			System.out.println("chain.material: "+chain.material);
			System.out.println("chain.weight: "+chain.weight);
			System.out.println("chain.stolen: "+chain.stolen);
			System.out.println("chain.usedFor: "+chain.usedFor);
			System.out.println("chain.fresh: "+chain.fresh);
			 System.out.println(System.lineSeparator());
			
			chain=new Chain("RopeChain",11543,19.8d,"silver",12d,true);
			System.out.println("*******constructor with six argument************");
			System.out.println("chain.type: "+chain.type);
			System.out.println("chain.price: "+chain.price);
			System.out.println("chain.length: "+chain.length);
			System.out.println("chain.material: "+chain.material);
			System.out.println("chain.weight: "+chain.weight);
			System.out.println("chain.stolen: "+chain.stolen);
			System.out.println("chain.usedFor: "+chain.usedFor);
			System.out.println("chain.fresh: "+chain.fresh);
		        System.out.println(System.lineSeparator());
			
			chain=new Chain("WheatChain",28555,21.8d,"platinum",9d,false,"secondTime");
			System.out.println("*******constructor with seven argument************");
			System.out.println("chain.type: "+chain.type);
			System.out.println("chain.price: "+chain.price);
			System.out.println("chain.length: "+chain.length);
			System.out.println("chain.material: "+chain.material);
			System.out.println("chain.weight: "+chain.weight);
			System.out.println("chain.stolen: "+chain.stolen);
			System.out.println("chain.usedFor: "+chain.usedFor);
			System.out.println("chain.fresh: "+chain.fresh);
			System.out.println(System.lineSeparator());
		
			chain=new Chain("FigaroChain",28555,21.8d,"gold",14d,true,"FirstTime",true);
			System.out.println("*******constructor with eight argument************");
			System.out.println("chain.type: "+chain.type);
			System.out.println("chain.price: "+chain.price);
			System.out.println("chain.length: "+chain.length);
			System.out.println("chain.material: "+chain.material);
			System.out.println("chain.weight: "+chain.weight);
			System.out.println("chain.stolen: "+chain.stolen);
			System.out.println("chain.usedFor: "+chain.usedFor);
			System.out.println("chain.fresh: "+chain.fresh);
			
			
			
			

	}

}
