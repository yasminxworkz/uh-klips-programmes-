package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {
	
		Collection<PalaceDTO> palace=new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("lalitmahal", "krishnaraja", false, 100));
		palace.add(new PalaceDTO("bangalore palace", "king chamaraja", true, 250));
		palace.add(new PalaceDTO("UmaidBhawan", "king Umaidbhawan", false, 30));
		palace.add(new PalaceDTO("AmberPalace", "rajamanSingh", true, 100));
		
		palace.stream().filter((p)->!p.isDestroyed()).collect(Collectors.toSet()).forEach(pr->System.out.println(pr));
			}

}
