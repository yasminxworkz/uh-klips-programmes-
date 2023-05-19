package com.xworkz.project.dto;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TechnologiesDTO {

	
	private String userId;
	@NotEmpty(message = "techName should not be empty")
    @Size(min = 3, max = 20)
	private String techName;
	@NotEmpty(message = "language should not be empty")
    @Size(min = 3, max = 20)
	private String language;
	@NotEmpty(message = "owner should not be empty")
    @Size(min = 3, max = 20)
	private String owner;
	@NotEmpty(message = "supportFrom should not be empty")
    @Size(min = 3, max = 20)
	private String supportFrom;
	@NotEmpty(message = "supportTo should not be empty")
    @Size(min = 3, max = 20)
	private String supportTo;
	@NotEmpty(message = "license should not be empty")
    @Size(min = 3, max = 20)
	private String license;
	private boolean openSource;
	@NotEmpty(message = "OSType should not be empty")
    @Size(min = 3, max = 20)
	private String OSType;
}
