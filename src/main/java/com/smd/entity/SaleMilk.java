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
@Table(name = "SaleMilk")
@DynamicInsert
public class SaleMilk {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Sno")
	private Long sno;

	@Column(name = "Plant_Code")
	private Long plantCode;

	@Column(name = "Plant_Name")
	private String plantName;

	@Column(name = "Supplier_Code")
	private Long supplierCode;

	@Column(name = "Supplier_Name")
	private String supplierName;

	@Column(name = "Financer_Code")
	private Long financerCode;

	@Column(name = "Financer_Name")
	private String financerName;
	
	@Column(name = "Vehicle_Number")
	private String vehicleNumber;

	@Column(name = "Milk_Kg")
	private Long milkKg;

	@Column(name = "Fat_Percentage")
	private Long fatPercentage;

	@Column(name = "CLR")
	private Long clr;

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
	
	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public Long getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(Long plantCode) {
		this.plantCode = plantCode;
	}

	public String getPlantName() {
		return plantName;
	}

	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	public Long getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(Long supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	

}
