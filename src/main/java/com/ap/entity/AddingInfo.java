package com.ap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="add_info")
public class AddingInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
		
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="phone")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dateCreated", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
	private Date createDate;
	
	@PrePersist
	private void onCreate() {
		createDate = new Date();
	}

	public AddingInfo() {
		super();
	}

	public AddingInfo(long id, String custName, String phoneNumber, String email, Date createDate) {
		super();
		this.id = id;
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.createDate = createDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
}
