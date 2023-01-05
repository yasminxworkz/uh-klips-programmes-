package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.constants.Type;
import com.xworkz.collections.dto.DataBaseVendorDTO;

public class DataBaseVendorRunner {

	public static void main(String[] args) {

		Collection<DataBaseVendorDTO> data = new ArrayList<DataBaseVendorDTO>();
		data.add(new DataBaseVendorDTO("Oracle", "LarryEllison", 00, 150000, Type.ORACLERDBMS));
		data.add(new DataBaseVendorDTO("MySQL", "oracle", 100, 12000, Type.MICROSOFTSQLSERVER));
		data.add(new DataBaseVendorDTO("TeraData", "TeraDataCorporation", 100, 0, Type.ORACLERDBMS));

		for (DataBaseVendorDTO dataBaseVendorDTO : data) {
			System.out.println(dataBaseVendorDTO);
		}

		System.out.println(System.lineSeparator());

		data.stream().map(dto -> dto.getDevelopedBy()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto.toUpperCase()));
		System.out.println(System.lineSeparator());

		data.stream().filter((dto) -> dto.getLicenseCost() <= 100D && dto.getName().contains("SQL"))
				.collect(Collectors.toSet()).forEach(value -> System.out.println(value));
	//	System.out.println(System.lineSeparator());

		data.stream().map(dto -> dto.getType()).collect(Collectors.toSet()).forEach(base -> System.err.println(base));

	}

}
