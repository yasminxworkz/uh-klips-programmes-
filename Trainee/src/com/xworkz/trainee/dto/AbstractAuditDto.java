package com.xworkz.trainee.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AbstractAuditDto implements Serializable{

	private String createdBy;
	private LocalDateTime  createdAt;
	private String updatedBy;
	private LocalDateTime updatedAt;
}
