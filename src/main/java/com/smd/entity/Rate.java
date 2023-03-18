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
@Table(name = "Rate")
@DynamicInsert
public class Rate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sno")
	private Long sno;
	
	@Column(name = "Party_Code")	
	private Long partyCode;
	
	@Column(name = "Rate")
	private Long rate;
	
	@Column(name = "Created_Date")	
	private Timestamp createdDate;
	
	@Column(name = "Create_By")
	private String createBy;
	
	@Column(name = "Modified_Date")
	private Timestamp modifiedDate;
	
	@Column(name = "Modified_By")
	private String modifiedBy;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public Long getPartyCode() {
		return partyCode;
	}

	public void setPartyCode(Long partyCode) {
		this.partyCode = partyCode;
	}

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Timestamp getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
}
