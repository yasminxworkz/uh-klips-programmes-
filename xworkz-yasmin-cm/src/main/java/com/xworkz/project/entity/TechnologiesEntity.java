package com.xworkz.project.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "technologiesList")
@NoArgsConstructor
@Data
@NamedQuery(name="findAll", query = "select entity from TechnologiesEntity entity")
@NamedQuery(name="findTechnology", query ="select entity from TechnologiesEntity entity where entity.techName=:param or entity.language=:param or entity.owner=:param or entity.supportFrom=:param or entity.supportTo=:param or entity.license=:param and entity.id=:id" )
public class TechnologiesEntity {
    @Id
	@Column(name = "t_id")
	private int tId;
  
	@Column(name = "t_userId")
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
    
   @ManyToOne(fetch = FetchType.EAGER, optional=false)
   @JoinColumn(name="id", referencedColumnName = "id")
   private ProjectEntity projectEntity;
}
