package com.xworkz.trainee.boot;

import com.xworkz.trainee.dto.TraineeDto;
import com.xworkz.trainee.service.TraineeService;
import com.xworkz.trainee.service.TraineeServiceImp;

public class Runner {

	public static void main(String[] args) {
		TraineeDto td=new TraineeDto("Rashmi", 22, "Xworkz");
		TraineeService ts=new TraineeServiceImp();
		ts.validateAndSave(td);

	}

}
