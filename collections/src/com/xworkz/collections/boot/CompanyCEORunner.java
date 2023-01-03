package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.CompanyCEODto;
import com.xworkz.collections.dto.DaughterDTO;

public class CompanyCEORunner {

	public static void main(String[] args) {
		
		DaughterDTO daughter1=new DaughterDTO("lucia", 789043233, 25, false, true);
		DaughterDTO daughter2=new DaughterDTO("leena", 789045633, 35, true, false);
		DaughterDTO daughter3=new DaughterDTO("hema", 734567233, 25, false, false);
		DaughterDTO daughter4=new DaughterDTO("jaya", 78765933, 45, true, true);
		
		CompanyCEODto dto1=new CompanyCEODto("SatyaNadella", "microsoft", 55, "BE", true, daughter4);
		CompanyCEODto dto2=new CompanyCEODto("sundarPichai", "google", 45, "Mtech", true, daughter3);
		CompanyCEODto dto3=new CompanyCEODto("larry ellison", "oracle", 85, "BE", true, daughter2);
		CompanyCEODto dto4=new CompanyCEODto("Michael", "dell", 75, "BE", true, daughter1);
		
		Collection<CompanyCEODto> company=new ArrayList<CompanyCEODto>();
		company.add(dto1);
		company.add(dto2);
		company.add(dto3);
		company.add(dto4);
		
		System.err.println("*********************************daughters details****************************************");
		company.stream().map(d->d.getdaughterDto()).collect(Collectors.toList()).forEach(com->System.out.println(com));
		System.out.println(System.lineSeparator());

		System.out.println("***********************************name of CEO's daughter**********************************************8");
		company.stream().map(d->d.getdaughterDto().getName()).collect(Collectors.toSet()).forEach(ele->System.err.println(ele));
		System.out.println(System.lineSeparator());
		
		System.out.println("*****************************daughters age > 30  *********************************");
		company.stream().filter(values->values.getAge()>30).collect(Collectors.toList()).forEach(d->System.out.println(d));
		System.out.println(System.lineSeparator());
		
		System.out.println("************************************ CEO and his Daughters Age*************************************************");
		company.stream().forEach(age->System.err.println("Father age:"+age.getAge()+"  Daughter age:"+age.getdaughterDto().getAge()));
	}

}
