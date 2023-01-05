package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {

		List<PalaceDTO> palace = new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("Lalitmahal", "Krishnaraja", false, 100));
		palace.add(new PalaceDTO("Bangalore palace", " Chamaraja", true, 250));
		palace.add(new PalaceDTO("UmaidBhawan", " Umaidbhawan", false, 30));
		palace.add(new PalaceDTO("AmberPalace", "RajamanSingh", true, 100));

		// palace.stream().filter((p)->!p.isDestroyed()).collect(Collectors.toSet()).forEach(pr->System.out.println(pr));

		palace.stream().sorted((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName())).collect(Collectors.toList())
				.forEach(b -> System.out.println(b));

		Comparator<PalaceDTO> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
		palace.stream().sorted(comparator).forEach(ele->System.err.println(ele));
		
	}
}
