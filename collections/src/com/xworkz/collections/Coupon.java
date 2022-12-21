package com.xworkz.collections;

import java.util.Collection;
import java.util.LinkedList;

public class Coupon {
	
	public static void main(String[] args) {
		String coupon1=" Percentage-based coupons";
		String coupon2="Free Shipping Coupons";
		String coupon3="Percent-Off Coupons";
		String coupon4="Free Trials";
		String coupon5="Abandoned Cart Coupons";
		String coupon6="Newsletter Subscription Discount";
		String coupon7="First-Time Purchase Discount";
		String coupon8="Newsletter Subscription Discount";
		String coupon9="Loyalty Points";
		String coupon10="Referral Promo Codes";
		String coupon11="Customer Milestone Discounts";
		String coupon12="Automated Coupons";
		
		Collection<String> collection=new LinkedList<String>();
		
		collection.add(coupon12);
		collection.add(coupon11);
		collection.add(coupon10);
		collection.add(coupon9);
		collection.add(coupon8);
		collection.add(coupon7);
		collection.add(coupon6);
		collection.add(coupon5);
		collection.add(coupon4);
		collection.add(coupon3);
		collection.add(coupon2);
		collection.add(coupon1);
		
		
		System.out.println(collection);
		System.out.println("size before clearing "+collection.size());
		
		collection.clear();

		System.out.println("size after clearing "+collection.size());
		

	}

}
