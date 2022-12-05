package com.xworkz.abstraction.abstracts;

public abstract class Person extends Object {
	
	private String name;
	private String location;
	private int age;
	private double weight;
	private boolean isWorking;

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

	public Person(String name, String location, int age, double weight, boolean isWorking) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
		this.weight = weight;
		this.isWorking = isWorking;
	}
	
	

	

	abstract void eat();
	
	abstract void sleep();
}
	
	
