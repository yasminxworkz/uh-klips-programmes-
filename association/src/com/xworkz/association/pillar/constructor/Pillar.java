package com.xworkz.association.pillar.constructor;

import com.xworkz.association.pillar.constants.PillarShapes;

public class Pillar {
	
	
	 public int id;
	 public String place;
	 public double height;
	 public boolean supporting;
	 public PillarShapes shapes=PillarShapes.CYLINDRICAL;
	 public Company company=new Company("bbmp",4);
	 
	 public Pillar(int id,String place,double height)
	 {
		 this.id=id;
		 this.place=place;
		 this.height=height;
	 }
	 
	 
	 public void support(boolean supporting) {
		 this.supporting=supporting;
	 }
	 
	 public void showOff() {
		 System.out.println("Pillar id: "+this.id);
		 System.out.println("Pillar place: "+this.place);
		 System.out.println("Pillar height:"+this.height);
		 System.out.println("Pillar shapes: "+this.shapes);
		 System.out.println("Pillar supporting: "+this.supporting);
		 company.showOff();
		 
	 }
	 
}
