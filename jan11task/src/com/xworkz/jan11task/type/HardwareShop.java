package com.xworkz.jan11task.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	private String gstNo;
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	@Autowired
	@Qualifier("address")
	private String address;
	
	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	

}
