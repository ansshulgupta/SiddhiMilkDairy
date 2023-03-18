package com.smd.service;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.smd.entity.Financer;
import com.smd.inbound.dto.FinancerDto;
import com.smd.repository.FinancerRepository;
import com.smd.util.CustomException;

@Service
public class FinancerService {

	private static final Logger logger = LoggerFactory.getLogger(FinancerService.class);

	@Autowired
	private FinancerRepository financerRepository;

	public FinancerService(FinancerRepository financerRepository) {
		super();
		this.financerRepository = financerRepository;
	}

	public String createOrUpdateFinancer(FinancerDto financerDto) throws CustomException {

		validateFinancerData(financerDto);

		Financer financer = new Financer();
		financer.setFinancerCode(financerDto.getFinancerCode());
		financer.setFinancerName(financerDto.getFinancerName());
		financer.setCreatedBy(financerDto.getCreatedBy());
		financer.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		
		financerRepository.save(financer);

		return "Financer Successful created.";
	}

	private void validateFinancerData(FinancerDto financerDto) throws CustomException {

		if (null == financerDto.getFinancerCode() || financerDto.getFinancerCode() < 0) {
			throw new CustomException("Invalid Financer Code");
		}
		if (null == financerDto.getFinancerName() || ObjectUtils.isEmpty(financerDto.getFinancerName())) {
			throw new CustomException("Invalid Financer Name");
		}
	}

}
