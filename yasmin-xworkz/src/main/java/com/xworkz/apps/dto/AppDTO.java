package com.xworkz.apps.dto;

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
	private int noOfProducts;
	private int noOfEmployes;
	@NotNull
	@NotEmpty
	@Size(max = 30, min = 3)
	private String name;

}
