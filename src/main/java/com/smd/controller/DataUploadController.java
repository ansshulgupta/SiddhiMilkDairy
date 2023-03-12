package com.smd.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class DataUploadController {

	private static final Logger logger = LoggerFactory.getLogger(DataUploadController.class);
	
	
	/**
	 * 
	 * This API to save or update bulkUploadCourseCompletion
	 * 
	 * @throws IOException
	 * @throws ChangeManagementException
	 */
	@PostMapping(value = "/bulkUploadCompletion")
	public String bulkUploadOfCourseCompletionExcel(@RequestParam(value = "file", required = true) 
	MultipartFile multipartFile) {
		logger.info("multipartFile multipartFile multipartFile: {}", multipartFile.getSize());
		try {
			//		cmLearningCourseService.processbulkUploadCourseCompletionExcel(multipartFile));
			
			
		} catch (Exception ex) {
			logger.error("Exception occured in CMLearningCourseController.processbulkUploadCourseCompletion: {} ",
					ex.getMessage());
			
		}
		return null;
	}
}
