package com.xworkz.apps.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AppDTO {
	
	private int id;
	@NotNull
	@NotEmpty
	@Size(max = 30, min = 3)
	private String developedBy;
	@NotNull
	@NotEmpty
	@Size(max = 30, min = 3)
	private String type;
	@Min(value = 2, message = "size must be greater than 2")
	private int noOfProducts;
	@Min(value = 2, message = "size must be greater than 2")
	private int noOfEmployes;
	@NotNull
	@NotEmpty
	@Size(max = 30, min = 3)
	private String name;
	
	

}
