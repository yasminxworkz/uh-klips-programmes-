package com.xworkz.abstraction.constructor;

public class ModiHospital {
	private HospitalRule hospital;

	public ModiHospital(HospitalRule hospital) {
		super();
		this.hospital = hospital;
	}
	
	public void rulesCheck() {
		if(hospital!=null) {
			boolean mask=this.hospital.wearMask();
			double distance=this.hospital.maintainDistance();
			boolean gloves=this.hospital.wearGloves();
			
			if(mask==true && distance>4 && gloves==true ) {
				System.out.println("the person is following the rules");
			}
			else {
				System.out.println("person is breaking rules");
			}
		}
	}
	

}
