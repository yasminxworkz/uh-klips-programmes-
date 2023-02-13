package com.xworkz.movies.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="acting")
@AllArgsConstructor
@NoArgsConstructor
public class MoviesDTO {
    
	@Column(name="m_id")
	@Id
	private int id;
	@Column(name="m_name")
	private String name;
	@Column(name="m_language")
	private String language;
	@Column(name="m_actor")
	private String actor;
	@Column(name="m_actress")
	private String actress;
	@Column(name="m_collection")
	private long collection;
	@Column(name="m_director")
	private String director;
	@Column(name="m_releasedYear")
	private Integer releasedYear;
	@Column(name="m_famous")
	private Boolean famous;
	
	
}
