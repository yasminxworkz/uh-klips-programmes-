package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import com.xworkz.collections.constants.EType;
import com.xworkz.collections.dto.PalaceDTO;
import com.xworkz.collections.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {
		WeaponDTO fight1=new WeaponDTO("air gun",      "diana",    2020, 5000, EType.HANDGUNS);
		WeaponDTO fight2=new WeaponDTO("blow gun",     "Steyr",    2022, 4000, EType.MACHINEGUNS);
		WeaponDTO fight3=new WeaponDTO("gattling gun", "Umarex",   2018, 6000, EType.RIFLES);
		WeaponDTO fight4=new WeaponDTO("musket",       "DayState", 2016, 9000, EType.PISTOLS);
		WeaponDTO fight5=new WeaponDTO("hand gun",     "Crosman",  2018, 2000, EType.SHOTGUNS);
		
		List<WeaponDTO> weapon=new ArrayList<WeaponDTO>();
		weapon.add(fight1);
		weapon.add(fight2);
		weapon.add(fight3);
		weapon.add(fight4);
		weapon.add(fight5);
		
		Comparator<WeaponDTO> comparator = (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName());
		weapon.stream().sorted(comparator).forEach(ele->System.out.println(ele));
		
		Comparator<WeaponDTO> comparatordes = (p1, p2) -> p2.getName().compareToIgnoreCase(p1.getName());
		weapon.stream().sorted(comparatordes).forEach(ele->System.err.println(ele));
		System.out.println(System.lineSeparator());
		
		System.out.println("**********************madeby**********************");
		Comparator<WeaponDTO> com = (b1, b2) -> b1.getMadeBy().compareToIgnoreCase(b2.getMadeBy());
		weapon.stream().sorted(com).forEach(el->System.out.println(el));
		
		Comparator<WeaponDTO> comdes = (b1, b2) -> b2.getMadeBy().compareToIgnoreCase(b1.getMadeBy());
		weapon.stream().sorted(comdes).forEach(el->System.err.println(el));
		System.out.println(System.lineSeparator());
		System.out.println("*********************************madeOn**************************");
		Comparator<WeaponDTO> comp = (a1, a2) ->Integer.compare(a1.getMadeOn(), a2.getMadeOn());
		weapon.stream().sorted(comp).forEach(ele->System.out.println(ele));
		
		Comparator<WeaponDTO> compdes = (a1, a2) ->Integer.compare(a2.getMadeOn(), a1.getMadeOn());
		weapon.stream().sorted(compdes).forEach(ele->System.err.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("*****************************price****************************************");
		
		Comparator<WeaponDTO> compare = (p1, p2) ->Integer.compare(p1.getPrice(), p2.getPrice());
		weapon.stream().sorted(compare).forEach(ele->System.out.println(ele));
		
		Comparator<WeaponDTO> comparedes = (p1, p2) ->Integer.compare(p2.getPrice(), p1.getPrice());
		weapon.stream().sorted(comparedes).forEach(ele->System.err.println(ele));
		System.out.println(System.lineSeparator());
		System.out.println("*****************************type*********************");
		Comparator<WeaponDTO> war = (c1, c2) -> c1.getType().compareTo(c2.getType());
		weapon.stream().sorted(war).forEach(ele->System.out.println(ele));
		
		Comparator<WeaponDTO> wardes = (c1, c2) -> c2.getType().compareTo(c1.getType());
		weapon.stream().sorted(wardes).forEach(ele->System.err.println(ele));
		
		
		
		
		
		

	}

}
