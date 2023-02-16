package com.xworkz.movies.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class CMDTO {
	@NotBlank(message = "CM name should not be null")
	@Size(min = 3, max = 20, message = "the name should be less than 20 and more than 3")
	private String name;
	@NotBlank(message = "state should not be null")
	private String state;
	@NotNull(message = "age should not be null")
	private Integer age;
	@NotNull(message = "tenure should not be null")
	private Integer tenure;

}
