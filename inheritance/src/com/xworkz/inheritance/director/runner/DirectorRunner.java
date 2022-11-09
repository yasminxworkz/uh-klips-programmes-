package com.xworkz.inheritance.director.runner;

import com.xworkz.inheritance.director.constructor.Director;
import com.xworkz.inheritance.director.constructor.Prashanth;

public class DirectorRunner {

	public static void main(String[] args) {
		Director direct=new Prashanth("movie director", "jannat", "actor");
		direct.display();

	}

}
