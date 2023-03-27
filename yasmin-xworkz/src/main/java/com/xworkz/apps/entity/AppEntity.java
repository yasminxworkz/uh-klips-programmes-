package com.xworkz.apps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "foodApp")
@NamedQuery(name="findByName", query = "select e from AppEntity e where e.name=:by")
@NamedQuery(name="findAll", query = "select e from AppEntity e")
@NamedQuery(name = "findByTwoProp", query = "select e from AppEntity e where e.developedBy=:developedBy or e.type=:type")
public class AppEntity {
	
	
	@Id
	@Column(name = "A_id")
	private int id;
	@Column(name = "A_developedBy")
	private String developedBy;
	@Column(name = "A_type")
	private String type;
	@Column(name = "A_noOfProducts")
	private int noOfProducts;
	@Column(name = "A_noOfEmployes")
	private int noOfEmployes;
	@Column(name = "A_name")
	private String name;

}
