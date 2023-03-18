package com.smd.service;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.smd.entity.Rate;
import com.smd.inbound.dto.RateDto;
import com.smd.repository.RateRepository;
import com.smd.util.CustomException;

@Service
public class RateService {

	private static final Logger logger = LoggerFactory.getLogger(RateService.class);

	@Autowired
	private RateRepository rateRepository;
		

	public RateService(RateRepository rateRepository) {
		super();
		this.rateRepository = rateRepository;
	}

	public String createOrUpdateRate(RateDto rateDto) throws CustomException  {
	  
	  validateRateData(rateDto);
	  
	  Rate rate = new Rate();
	  
	  rate.setPartyCode(rateDto.getPartyCode());
	  rate.setRate(rateDto.getRate());
	  
	  if(null!=rateDto.getSno()) { 
		  rate.setModifiedBy(rateDto.getCreator()); 
		  rate.setCreatedDate(new Timestamp(System.currentTimeMillis())); 
		  }else {
		  rate.setCreateBy(rateDto.getCreator());
		  rate.setCreatedDate(new Timestamp(System.currentTimeMillis())); 
		  } 	
	  
	  rateRepository.save(rate);
	  
	  return "Rate Successful created."; 
	  }

	private void validateRateData(RateDto rateDto) throws CustomException{

		if (null == rateDto.getPartyCode() || rateDto.getPartyCode() < 0) {
			throw new CustomException("Invalid Party Code");
		}
		if (null == rateDto.getRate() || rateDto.getRate() <= 0) {
			throw new CustomException("Invalid Rate");
		}
		if (null == rateDto.getCreator() || ObjectUtils.isEmpty(rateDto.getCreator())) {
			throw new CustomException("Invalid Creator");
		}
	}

}
