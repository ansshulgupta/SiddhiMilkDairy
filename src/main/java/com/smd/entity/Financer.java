package com.smd.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Financer")
@DynamicInsert
public class Financer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sno")
	private Long sno;

	@Column(name = "Financer_Code")
	private Long financerCode;

	@Column(name = "Financer_Name")
	private String financerName;

	@Column(name = "Created_Date")
	private Timestamp createdDate;

	@Column(name = "Created_By")
	private String createdBy;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public Long getFinancerCode() {
		return financerCode;
	}

	public void setFinancerCode(Long financerCode) {
		this.financerCode = financerCode;
	}

	public String getFinancerName() {
		return financerName;
	}

	public void setFinancerName(String financerName) {
		this.financerName = financerName;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	
}
