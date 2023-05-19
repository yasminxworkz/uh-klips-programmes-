package com.xworkz.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "technologiesList")
@NoArgsConstructor
@Data
@NamedQuery(name="findAll", query = "select e from TechnologiesEntity e")
@NamedQuery(name="findByTechnology", query ="select e from TechnologiesEntity e where e.techName=:by" )
public class TechnologiesEntity {
    @Id
	@Column(name = "t_id")
	private int id;
	@Column(name = "userId")
	private String userId;
    @Column(name = "t_techName")
	private String techName;
    @Column(name = "t_language")
	private String language;
    @Column(name = "t_owner")
	private String owner;
    @Column(name = "t_supportFrom")
	private String supportFrom;
    @Column(name = "t_supportTo")
	private String supportTo;
    @Column(name = "t_license")
	private String license;
    @Column(name = "t_openSource")
	private boolean openSource;
    @Column(name = "t_OSType")
	private String OSType;
//    @ManyToOne
//    @JoinColumn(name="userId")
//    private ProjectEntity projectEntity;
}
