package com.xworkz.project.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DTOClass {
    
	@NotNull
	@Size(min = 4, max = 50, message = "the length should be greater than 4 and less than 50")
	private String userId;
	@NotNull
	@Size(min = 4, max = 50)
	@Email
	private String email;
	@Min(value = 6000000000l, message = "the number should start with 6 and must contain 10 digits ")
	@Max(value = 9999999999l, message = "the number should start with 6 and must contain 10 digits " )
	private Long mobileNumber;
	@NotNull
	@Size(min = 3, max = 50)
	private String password;
	
	private String agreement;
	
	@Size(min = 4, max = 50)
	private String confirmPassword;

}
