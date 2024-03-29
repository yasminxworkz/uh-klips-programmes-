package com.xworkz.aeroplane.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "plane_details")
public class AeroplaneEntity {
	@Id
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_company")
	private String company;
	@Column(name = "a_name")
	 private String name;
	@Column(name = "a_cost")
	 private int cost;
	@Column(name = "a_type")
	 private String type;
	@Column(name = "a_country")
	 private String country;	
	

}
