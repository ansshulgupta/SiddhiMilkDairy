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
@Table(name = "Party")
@DynamicInsert
public class Party {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sno")
	private Long sno;

	@Column(name = "Party_Code")
	private Long partyCode;

	@Column(name = "Party_Name")
	private String partyName;

	@Column(name = "Father_Name")
	private String fatherName;

	@Column(name = "Party_Address")
	private String partyAddress;

	@Column(name = "Party_Phone_Number")
	private String partyPhoneNumber;

	@Column(name = "Under_Group")
	private String underGroup;

	@Column(name = "Party_Bank_Name")
	private String partyBankName;

	@Column(name = "Party_Account_Number")
	private String partyAccountNumber;

	@Column(name = "Party_Account_Image")
	private String partyAccountImage;

	@Column(name = "Party_RTGS")
	private String partyRTGS;

	@Column(name = "Party_Aadhar_Number")
	private String partyAadharNumber;

	@Column(name = "Party_Aadhar_Image")
	private String partyAadharImage;

	@Column(name = "Party_PAN_Number")
	private String partyPANNumber;

	@Column(name = "Party_PAN_Image")
	private String partyPANImage;

	@Column(name = "Comment1")
	private String comment1;

	@Column(name = "Comment2")
	private String comment2;

	@Column(name = "Rate")
	private Long rate;

	@Column(name = "Created_Date")
	private Timestamp createdDate;

	@Column(name = "Created_By")
	private String createdBy;

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

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getPartyAddress() {
		return partyAddress;
	}

	public void setPartyAddress(String partyAddress) {
		this.partyAddress = partyAddress;
	}

	public String getPartyPhoneNumber() {
		return partyPhoneNumber;
	}

	public void setPartyPhoneNumber(String partyPhoneNumber) {
		this.partyPhoneNumber = partyPhoneNumber;
	}

	public String getUnderGroup() {
		return underGroup;
	}

	public void setUnderGroup(String underGroup) {
		this.underGroup = underGroup;
	}

	public String getPartyBankName() {
		return partyBankName;
	}

	public void setPartyBankName(String partyBankName) {
		this.partyBankName = partyBankName;
	}

	public String getPartyAccountNumber() {
		return partyAccountNumber;
	}

	public void setPartyAccountNumber(String partyAccountNumber) {
		this.partyAccountNumber = partyAccountNumber;
	}

	public String getPartyAccountImage() {
		return partyAccountImage;
	}

	public void setPartyAccountImage(String partyAccountImage) {
		this.partyAccountImage = partyAccountImage;
	}

	public String getPartyRTGS() {
		return partyRTGS;
	}

	public void setPartyRTGS(String partyRTGS) {
		this.partyRTGS = partyRTGS;
	}

	public String getPartyAadharNumber() {
		return partyAadharNumber;
	}

	public void setPartyAadharNumber(String partyAadharNumber) {
		this.partyAadharNumber = partyAadharNumber;
	}

	public String getPartyAadharImage() {
		return partyAadharImage;
	}

	public void setPartyAadharImage(String partyAadharImage) {
		this.partyAadharImage = partyAadharImage;
	}

	public String getPartyPANNumber() {
		return partyPANNumber;
	}

	public void setPartyPANNumber(String partyPANNumber) {
		this.partyPANNumber = partyPANNumber;
	}

	public String getPartyPANImage() {
		return partyPANImage;
	}

	public void setPartyPANImage(String partyPANImage) {
		this.partyPANImage = partyPANImage;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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
