package com.xworkz.inheritance.dj.runner;

import com.xworkz.inheritance.dj.constructor.DJ;
import com.xworkz.inheritance.dj.constructor.Music;

public class DJRunner {

	public static void main(String[] args) {
		DJ song=new Music("DiscJockey", "Patola", 8);
		System.out.println(song.abbreviation);
		System.out.println(song.song);
		System.out.println(song.djTypes);

	}

}
