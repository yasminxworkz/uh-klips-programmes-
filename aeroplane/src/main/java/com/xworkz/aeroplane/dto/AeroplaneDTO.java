package com.xworkz.aeroplane.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AeroplaneDTO {
	@NotNull
	@NotEmpty
	@Size(min = 4, max = 20)
 private String company;
	@NotNull
	@NotEmpty
	@Size(min = 4, max = 20)
 private String name;
	
 private int cost;
 @NotNull
	@NotEmpty
	@Size(min = 4, max = 20)
 private String type;
 @NotNull
	@NotEmpty
	@Size(min = 4, max = 20)
 private String country;
}
