package com.smd.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;


public class DataUploadService {

	private static final Logger logger = LoggerFactory.getLogger(DataUploadService.class);
	
	public String processbulkUploadCourseCompletionExcel(MultipartFile multipartFile)
			throws IOException {
		String sheet = "Report";
		XSSFWorkbook workbook = new XSSFWorkbook(multipartFile.getInputStream());
		XSSFSheet worksheet = workbook.getSheet(sheet);
		for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
			XSSFRow row = worksheet.getRow(i);
			logger.info("row.getCell(0) is: {}", row.getCell(0).getNumericCellValue());
			logger.info("row.getCell(1) is: {}", row.getCell(1).getStringCellValue());
			logger.info("row.getCell(2) is: {}", row.getCell(2).getStringCellValue());
			logger.info("row.getCell(3) is: {}", row.getCell(3).getStringCellValue());
			logger.info("row.getCell(4) is: {}", row.getCell(4).getBooleanCellValue());
			logger.info("row.getCell(5) is: {}", row.getCell(5).getBooleanCellValue());
			logger.info("row.getCell(6) is: {}", row.getCell(6).getNumericCellValue());
			if (null != Long.valueOf((long) row.getCell(0).getNumericCellValue())
					&& Long.valueOf((long) row.getCell(0).getNumericCellValue()) > 0) {
		//		courseCompletionApi.setCourseCompletionId(Long.valueOf((long) row.getCell(0).getNumericCellValue()));
		//		courseCompletionApi.setUserEmail(String.valueOf(row.getCell(2).getStringCellValue()));
		//		courseCompletionApi.setCourseCompleted(row.getCell(5).getBooleanCellValue());
		//		courseCompletionApi.setAssessmentScore(Long.valueOf((long) row.getCell(6).getNumericCellValue()));
			}else {
				// raise exception data missing
			}
		}
		logger.debug("Completed Execution processUploadData....");
		workbook.close();
		return "Data successfully saved.";
	}
}
