package com.xworkz.alltopics.cruds.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AbstractAuditDto implements Serializable {

	private String startedBy;
	private LocalDateTime startedDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
	
	public AbstractAuditDto() {
		// TODO Auto-generated constructor stub
	}

	public AbstractAuditDto(String startedBy, LocalDateTime startedDate, String updatedBy, LocalDateTime updatedDate) {
		this.startedBy = startedBy;
		this.startedDate = startedDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "AbstractAuditDto [startedBy=" + startedBy + ", startedDate=" + startedDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	
}
