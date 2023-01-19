package com.xworkz.validation.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class FirstAidDto extends AbstractAuditDto {
	@NotNull
	@Size(max = 20, min = 2)
	private String color;
	

}
