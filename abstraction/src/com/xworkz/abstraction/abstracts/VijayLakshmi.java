package com.xworkz.abstraction.abstracts;

public class VijayLakshmi extends JavaTrainee implements KarnatakaRto{
	

	public VijayLakshmi(String name, String location, int age, double weight, boolean isWorking) {
		super(name, location, age, weight, isWorking);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double vat() {
		System.out.println("method vat");
		return 200;
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("method uploadedtask");
		return super.uploadedTask();
	}

	@Override
	public boolean completedProgram() {
		System.out.println("method completed program");
		return super.completedProgram();
	}

	@Override
	public boolean paidTax(double income) {
		System.out.println("paid tax method");
		return KarnatakaRto.super.paidTax(income);
	}

	@Override
	public double gst() {
         System.out.println("method gst");
		return KarnatakaRto.super.gst();
	}
	
	@Override
	public boolean training() {
		System.out.println("method training");
		return super.training();
	}

	@Override
	public void executeProgram() {
		System.out.println("method executeProgram");
		super.executeProgram();
	}

	@Override
	public void eat() {
		System.out.println("method eat");
		super.eat();
	}

	@Override
	public void sleep() {
		System.out.println("method sleep");
		super.sleep();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	

}
