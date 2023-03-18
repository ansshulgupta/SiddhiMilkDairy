package com.smd.inbound.dto;

public class RateDto {

	private Long sno;

	private Long partyCode;

	private Long rate;

	private String creator;
	
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

}
