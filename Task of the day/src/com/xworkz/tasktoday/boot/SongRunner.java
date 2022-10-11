package com.xworkz.tasktoday.boot;

import com.xworkz.tasktoday.constructor.*;

public class SongRunner {

	public static void main(String[] args) {
		
		Song song1=new Song();
		System.out.println(song1.name);
		System.out.println(song1.language);
		System.out.println(song1.singer);
		System.out.println(song1.lyricist);
		System.out.println(song1.type);
		
		song1.name="suna hai";
		song1.language="hindi";
		song1.singer="shreya";
		song1.lyricist="rashmi virag";
		song1.type="romantic";
		System.out.println(song1.name);
		System.out.println(song1.language);
		System.out.println(song1.singer);
		System.out.println(song1.lyricist);
		System.out.println(song1.type);
		

	}

}
