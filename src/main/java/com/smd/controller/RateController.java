package com.smd.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smd.inbound.dto.RateDto;
import com.smd.service.RateService;
import com.smd.util.CustomException;

@RestController
@RequestMapping("/SMD/rate")
public class RateController {

	private static final Logger logger = LoggerFactory.getLogger(RateController.class);
	
	@Autowired
	private RateService rateService;
		
	
	public RateController(RateService rateService) {
		super();
		this.rateService = rateService;
	}


	@GetMapping(value = "/hello")
	public String hello() {
		logger.info("Hello: {}");		
			return "application is up and running";	
	}
	

	/**
	 * 
	 * This API to save or update Rate
	 * 
	 * @throws Exception
	 */
	@PostMapping(value = "/createOrUpdateRate", produces = MediaType.APPLICATION_JSON_VALUE)
	public String createOrUpdateRate(@RequestBody RateDto rateDto) {
		logger.info("Inserting Rate : {}");
		try {
			return rateService.createOrUpdateRate(rateDto);			
			
		}
		 catch (CustomException cex) {
				logger.error("Exception occured in while inserting rate RateController.processbulkUploadCourseCompletion: {} ",
						cex.getMessage());
				return cex.getMessage();
			}
		catch (Exception ex) {
			logger.error("Exception occured in while inserting rate RateController.processbulkUploadCourseCompletion: {} ",
					ex.getMessage());
			return ex.getMessage();
		}
	}
	
}
