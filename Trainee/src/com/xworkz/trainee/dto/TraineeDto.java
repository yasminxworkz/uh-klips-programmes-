package com.xworkz.trainee.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TraineeDto {
	@NonNull
	@NotNull
	@Size(min = 3,max = 20,message = "Name is invalid should be more than 3")
	private String name;
	@NonNull
	@Min(value = 2, message = "Age should be greater than 2")
	@Max(value = 90, message = "Age should be less than 90")
	private int age;
	@NonNull
	@NotNull
	@Size(min = 3,max = 20,message = "Name is invalid should be more than 3")
	private String course;
	
	
	
	
	

}
