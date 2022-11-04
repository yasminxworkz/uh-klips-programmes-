package com.xworkz.encapsulation.watch.constructor;

public class Time {
	
	Watch watch=new Watch();
	
	public void setWatch() {
		watch.type="smart watch";
		watch.price=9000;
		watch.brand="titan";
	}
	
	public void use() {
		System.out.println("watch brand :"+this.watch.brand);
		System.out.println("watch price :"+this.watch.price);
		System.out.println("watch type :"+this.watch.type);
		
		System.out.println("watch brandAmbassador :"+watch.brandAmbassador);
		System.out.println("watch working :"+watch.working);
		System.out.println("watch beltType :"+watch.beltType);
		System.out.println("watch function :"+watch.function);
		
		System.out.println("*****************private access specifier************");
		watch.setwatchCompanyRevenue(2903333333333l);
		System.out.println(watch.getwatchCompanyRevenue());
		watch.setColor("black");
		System.out.println(watch.getColor());
		watch.setOwner("moin");
		System.out.println(watch.getOwner());
		watch.setwatchCompanyLocation("delhi");
		System.out.println(watch.getwatchCompanyLocation());
		watch.setcurrentTime(9);
		System.out.println(watch.getcurrentTime());
		watch.setComfort(true);
		System.out.println(watch.isComfort());
		
		
	}

}
