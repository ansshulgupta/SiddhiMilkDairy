package com.smd.inbound.dto;

public class FinancerDto {

	private Long sno;
	private Long financerCode;
	private String financerName;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
}
