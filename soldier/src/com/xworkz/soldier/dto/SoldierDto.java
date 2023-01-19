package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class SoldierDto extends AbstractAuditDto {
	
	@NonNull
	@NotNull(message = "soldierName cannot be null")
	@Size(min=3, max=20, message="Name is invalid should be more than 3")
	private String soldierName;
	@NonNull
	@NotNull(message = "status cannot be null")
	@Size(min=3, max=20, message="status is invalid should be more than 3")
	private String status;
	@NonNull
	@NotNull(message = "residence cannot be null")
	@Size(min=3, max=20, message="residence is invalid should be more than 3")
	private String residence;
	@Min(1)
	@Max(10)
	private int term;
	
	

}
