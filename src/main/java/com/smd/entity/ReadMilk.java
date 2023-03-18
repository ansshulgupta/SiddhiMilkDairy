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
@Table(name = "ReadMilk")
@DynamicInsert
public class ReadMilk {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Sno")
	private Long sno;

	@Column(name = "Party_Code")
	private Long partyCode;

	@Column(name = "Party_Name")
	private String partyName;

	@Column(name = "Vehicle_Number")
	private String vehicleNumber;
	
	@Column(name = "Milk_Kg")
	private Long milkKg;

	@Column(name = "Fat_Percentage")
	private Long fatPercentage;

	@Column(name = "CLR")
	private Long clr;

	@Column(name = "KFat_Percentage")
	private Long kFatPercentage;

	@Column(name = "KCLR")
	private Long kclr;

	@Column(name = "RIMA")
	private String rima;

	@Column(name = "Chhena")
	private Long chhena;

	@Column(name = "Amount")
	private Long amount;

	@Column(name = "Created_Date")
	private Timestamp createdDate;

	@Column(name = "Created_By")
	private String createdBy;

	@Column(name = "Modified_Date")
	private Timestamp modifiedDate;

	@Column(name = "Modified_By")
	private String modifiedBy;	

	@Column(name = "Narration")
	private String narration;

	@Column(name = "Optional1")
	private String optional1;

	@Column(name = "Optional2")
	private String optional2;

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

	public Long getMilkKg() {
		return milkKg;
	}

	public void setMilkKg(Long milkKg) {
		this.milkKg = milkKg;
	}

	public Long getFatPercentage() {
		return fatPercentage;
	}

	public void setFatPercentage(Long fatPercentage) {
		this.fatPercentage = fatPercentage;
	}

	public Long getClr() {
		return clr;
	}

	public void setClr(Long clr) {
		this.clr = clr;
	}

	public Long getkFatPercentage() {
		return kFatPercentage;
	}

	public void setkFatPercentage(Long kFatPercentage) {
		this.kFatPercentage = kFatPercentage;
	}

	public Long getKclr() {
		return kclr;
	}

	public void setKclr(Long kclr) {
		this.kclr = kclr;
	}

	public String getRima() {
		return rima;
	}

	public void setRima(String rima) {
		this.rima = rima;
	}

	public Long getChhena() {
		return chhena;
	}

	public void setChhena(Long chhena) {
		this.chhena = chhena;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getOptional1() {
		return optional1;
	}

	public void setOptional1(String optional1) {
		this.optional1 = optional1;
	}

	public String getOptional2() {
		return optional2;
	}

	public void setOptional2(String optional2) {
		this.optional2 = optional2;
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

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
}
