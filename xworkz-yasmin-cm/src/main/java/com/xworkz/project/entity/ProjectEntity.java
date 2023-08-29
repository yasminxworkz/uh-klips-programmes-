package com.xworkz.project.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "userDetails")
@NamedQuery(name = "fetchAll", query = "select entity from ProjectEntity entity")
@NamedQuery(name = "findByUserId", query = "select entity from ProjectEntity entity where entity.userId=:by")
@NamedQuery(name = "findByEmail", query = "select entity from ProjectEntity entity where entity.email=:em")
@NamedQuery(name = "expireOTP", query = "update ProjectEntity entity set entity.otpExpired=:boolean where entity.otpRequestedTime<=:currentTime")
public class ProjectEntity {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "userId")
	private String userId;

	@Column(name = "p_email")
	private String email;

	@Column(name = "p_mobile")
	private Long mobileNumber;

	@Column(name = "p_password")
	private String password;

	@Column(name = "p_createdBy")
	private String createdBy;

	@Column(name = "p_createdDate")
	private LocalDateTime createdDate = LocalDateTime.now();

	@Column(name = "p_updatedBy")
	private String updatedBy;

	@Column(name = "p_updatedDate")
	private LocalDateTime updatedDate;

	@Column(name = "login_count")
	private Integer loginCount = 0;

	@Column(name = "resetPassword")
	private Boolean resetPassword = false;

	@Column(name = "profile_pic_name")
	private String profilepic;

	@Column(name = "otp_RequestedTime")
	private LocalTime otpRequestedTime;

	@Column(name = "otp_expired")
	private Boolean otpExpired;

	@OneToMany(mappedBy = "projectEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<TechnologiesEntity> technologiesEntities;

}
